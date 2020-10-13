import React from 'react';
import { Text } from 'react-native';

export default function Card ({ title }) {
   return (
      <View style={styles.header}>
         <View>
            <Text style={styles.headerText}>{ title }</Text>
         </View>
      </View>
   )
}

const styles = StyleSheet.create({
   header: {

   },
   headerText: {
      
   }
})