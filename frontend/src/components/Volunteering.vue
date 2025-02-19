<template>
    <div>
        <Number label="VolunteeringId" v-model="value.volunteeringId" :editMode="editMode"/>
        <Date label="일정" v-model="value.schedule" :editMode="editMode"/>
        <String label="제목" v-model="value.title" :editMode="editMode"/>
        <String label="분야" v-model="value.category" :editMode="editMode"/>
        <Number label="정원" v-model="value.personnel" :editMode="editMode"/>
        <Address offline label="위치" v-model="value.place" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Volunteering',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "volunteerings"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
