/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainGUI;
//note to self: if possible, make methods require employeeNumber (to limit user control?)
import java.util.ArrayList;

/**
 * @author Bilaal
 */
public class HashTable {

        int numItems;
        private ArrayList<EmployeeInfo>[] buckets;
       
        public HashTable(int numBuckets) {
            buckets = new ArrayList[numBuckets];
            for (int i = 0; i < numBuckets; i++) {
                buckets[i] = new ArrayList<EmployeeInfo>(); 
            }
        }

        // Getter for the number of buckets
        public ArrayList<EmployeeInfo>[] getNumBuckets() {
            return buckets;
        }

        public int calcBucket(int eNumToCalc) {
            return eNumToCalc % buckets.length;
        }

        public void addToTable(EmployeeInfo eToAdd) {
            int bucketNum = calcBucket(eToAdd.getEmployeeNumber());
            buckets[bucketNum].add(eToAdd);
        }

        public EmployeeInfo removeFromTable(int eNumToRemove) {
            int bucketNum = calcBucket(eNumToRemove);
            int pointer = findInTable(eNumToRemove);
            if (pointer != -1) {
                buckets[bucketNum].remove(pointer);
            }
            return null;
        }

        public int findInTable(int eNumToFind) {
            int bucketNum = calcBucket(eNumToFind);
            for (int i = 0; i < buckets[bucketNum].size(); i++) {
                if (buckets[bucketNum].equals(eNumToFind)) {
                    return i;
                }
            }
            return -1;
        } 
    }
