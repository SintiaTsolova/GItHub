package homework.Person;

import java.time.LocalDate;

public class personGetSet {

        private String name;
        private String sex;
        private String religion;
        private String languageSpoken;
        private String job;
        private String nationality;
        private String egn;
        private String dateOfBirth;
        private int age;
        private String countryOfResidence;

        public personGetSet(String name, String sex, String religion, String languageSpoken, String job, String nationality,
                      String egn, String countryOfResidence) {
            this.name = name;
            this.sex = sex;
            this.religion = religion;
            this.languageSpoken = languageSpoken;
            this.job = job;
            this.nationality = nationality;
            this.egn = egn;
            this.countryOfResidence = countryOfResidence;
            calculateAgeAndDateOfBirth(egn);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getReligion() {
            return religion;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }

        public String getLanguageSpoken() {
            return languageSpoken;
        }

        public void setLanguageSpoken(String languageSpoken) {
            this.languageSpoken = languageSpoken;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getEgn() {
            return egn;
        }

        public void setEgn(String egn) {
            if (egn.length() == 10 && digits(egn)) {
                this.egn = String.valueOf(Integer.parseInt(egn));
            } else {
                throw new RuntimeException("Invalid credentials!");
            }
        }

        public int getAge() {
            return age;
        }

        public void calculateAgeAndDateOfBirth(String egn) {
            String birthYear = egn.substring(0, 2);
            String month = egn.substring(2, 4);
            String date = egn.substring(4, 6);

            int currentYear = LocalDate.now().getYear() % 100;
            int ageYear = currentYear - Integer.parseInt(birthYear);

            if (month.charAt(0) == '0') {
                month = month.substring(1);
            }

            if (date.charAt(0) == '0') {
                date = date.substring(1);
            }

            int monthOfYear = Integer.parseInt(month);
            if (monthOfYear > 40) {
                monthOfYear -= 40;
            }

            if (monthOfYear < 10) {
                month = "0" + monthOfYear;
            } else {
                month = String.valueOf(monthOfYear);
            }

            this.age = ageYear;
            this.dateOfBirth = month + "-" + date + "-" + birthYear;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String egn) {
            String month = egn.substring(2, 4);
            String date = egn.substring(4, 6);
            this.dateOfBirth = month + "-" + date;
        }

        public boolean digits(String str) {
            try {
                Long.parseLong(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public String getCountryOfResidence() {
            return countryOfResidence;
        }

        public void setCountryOfResidence(String countryOfResidence) {
            this.countryOfResidence = countryOfResidence;
        }
}
