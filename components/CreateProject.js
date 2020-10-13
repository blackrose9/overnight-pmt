import React from 'react';
import { StyleSheet, Text, TextInput, TouchableOpacity, View } from 'react-native';

const CreateProject = () => {
   return ( 
      <View>
         <TextInput placeholder="Project Name" style={styles.input} />
         <TextInput placeholder="Project Details" style={styles.input} />
         <TouchableOpacity style={styles.btn}>
            <Text style={styles.btnText}>Add Project</Text>
         </TouchableOpacity>
      </View>

    );
}

const styles = StyleSheet.create({
   card: {

   },
   cardContent: {
      
   }
})
 
export default CreateProject;