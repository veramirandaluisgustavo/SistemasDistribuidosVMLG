<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    protected $batch = 3;
    public function up(): void
    {
        Schema::create('cola', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger("medico_id");
            $table->unsignedBigInteger("consultorio_id");
            $table->String("limite");
            $table->timestamps();

            $table->foreign('medico_id')->references('id')->on('medico');
            $table->foreign('consultorio_id')->references('id')->on('consultorio');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('cola');
    }
};
