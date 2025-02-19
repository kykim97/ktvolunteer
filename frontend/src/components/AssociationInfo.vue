<template>
    <div>
        <Number label="AssociationId" v-model="value.associationId" :editMode="editMode"/>
        <String label="연락처" v-model="value.tel" :editMode="editMode"/>
        <Number label="사업자번호" v-model="value.bizNumber" :editMode="editMode"/>
        <Address offline label="주소" v-model="value.address" :editMode="editMode" @change="change"/>
        <Email offline label="이메일" v-model="value.email" :editMode="editMode" @change="change"/>

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
    name: 'AssociationInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "associationInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
