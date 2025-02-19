<template>

    <v-card outlined>
        <v-card-title>
            봉사활동일정등록
        </v-card-title>

        <v-card-text>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="봉사활동일정등록"
            >
                봉사활동일정등록
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>

export default {
    name: '봉사활동일정등록Command',
    components:{
    },
    props: {},
    data: () => ({
        editMode: true,
        value: {},
    }),
    created() {
    },
    watch: {
    },
    methods: {
        봉사활동일정등록() {
            this.$emit('봉사활동일정등록', this.value);
        },
        close() {
            this.$emit('closeDialog');
        },
        change() {
            this.$emit("update:modelValue", this.value);
        },
    }
}
</script>

