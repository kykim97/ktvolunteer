<template>
    <div>
        <Date label="일정" v-model="value.schedule" :editMode="editMode"/>
        <String label="활동명" v-model="value.title" :editMode="editMode"/>
        <Address offline label="장소" v-model="value.place" :editMode="editMode" @change="change"/>
        <AssociationInfoId offline label="수혜기관정보 ID" v-model="value.associationInfoId" :editMode="editMode" @change="change"/>

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
    name: '봉사활동정보',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "봉사활동정보"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
