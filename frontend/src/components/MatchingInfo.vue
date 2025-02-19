<template>
    <div>
        <Number label="MatchingId" v-model="value.matchingId" :editMode="editMode"/>
        <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
        <Number label="AssociationId" v-model="value.associationId" :editMode="editMode"/>
        <String label="활동분야" v-model="value.category" :editMode="editMode"/>
        <Address offline label="지역정보" v-model="value.location" :editMode="editMode" @change="change"/>

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
    name: 'MatchingInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "matchingInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
