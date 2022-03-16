package com.tmps.FactoryMethod;

public class Program {

        public static void main(String[] args){
            DeveloperFactory developerFactory = CreateDeveloperBySpeciality("java");
            Developer developer = developerFactory.CreateDeveloper();

            developer.WriteCode();
        }

        static DeveloperFactory CreateDeveloperBySpeciality(String speciality){
            if (speciality.equalsIgnoreCase("java")){
                return new JavaDeveloperFactory();
            }else if (speciality.equalsIgnoreCase("php")){
                return new PHPDeveloperFactory();
            }else{
                throw new RuntimeException(speciality + " is unknown speciality.");
            }
        }
}
