package lessons.lesson4.example1;

import java.util.Arrays;

class UserRepository {

    private UserEntity[] database = new UserEntity[0];

    public void add(UserEntity str) {
        // database.length == 0  create new DB min size 1
        UserEntity[] newDatabase = new UserEntity[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = str;

        database = newDatabase;
    }

    public void printInformation() {
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i]);
        }
//        System.out.println(Arrays.toString(database));
    }

    public void changeName(int userId, String name) {
        for (int i = 0; i < database.length; i++) {
            if (database[i].getUserID() == userId) {
                UserEntity userEntity = database[i];
                userEntity.setUserName(name);
                return;
            }
        }
    }

    public UserEntity[] getDatabase() {
        return Arrays.copyOf(database, database.length);
    }
}
