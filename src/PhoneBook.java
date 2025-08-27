public class PhoneBook {
    private String[] names;
    private String[] phones;
    private int phoneSize;
    private int currentIndex = 0;

    void setSize(int s) {
        phoneSize = s;
        names = new String[s];
        phones = new String[s];
    }

    boolean checkNum(String phone) {
        if (phone.length() != 11) return false;

        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (c < '0' || c > '9')
            {
                System.out.println("invalid number");
                return false;
            }

        }
        return true;
    }

    boolean addEntry(String name, String phone) {
        if (currentIndex < phoneSize && checkNum(phone)) {
            names[currentIndex] = name;
            phones[currentIndex] = phone;
            currentIndex++;
            return true;
        }
            return false;
        }



    boolean displayEntryAtIndex(int i) {
        if (i < 0 || i >= phoneSize)
        {
            System.out.println("invalid index");
            return false;
        }

        if (names[i] != null && phones[i] != null) {
            System.out.println(names[i] + " " + phones[i]);
            return true;
        } else {
            System.out.println("erorr");
            return false;
        }
    }

    void displayEntryAtIndices(int[] arr) {
        for (int i = 0; i < phoneSize; i++) {
            if (arr[i] == 1) {
                displayEntryAtIndex(i);
            }
        }
    }
    void displayAll() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(names[i] + " " + phones[i]);
        }
    }
    int [] findByName(String name)
    {
        int []res=new int[phoneSize];
        for(int i=0;i<currentIndex;i++)
        {
            if(names[i].contains(name))
                res[i]=1;
            else
                res[i]=0;
        }
        return res;
    }
    String findByPhone(String phone) {
        for (int i = 0; i < currentIndex; i++) {
            if (phones[i].equals(phone)) {
                return names[i];
            }


        }
        return "number not found";
    }
    boolean updateNameAt(String newName, int i) {
        if (i >= 0 && i < currentIndex) {
            names[i] = newName;
            System.out.println("update done");
            displayAll();
            return true;
        }
        return false;
    }
   boolean updatePhoneAt(String newPhone, int i) {
        if (i >= 0 && i < currentIndex && checkNum(newPhone)) {
            phones[i] = newPhone;
            System.out.println("update done");
            displayAll();
            return true;
        }
        return false;
    }
    void copyPB(PhoneBook pb) {
        pb.setSize(phoneSize);
        for (int i = 0; i < phoneSize; i++) {
            pb.names[i] = names[i];
            pb.phones[i] =phones[i];
        }
    }


}
