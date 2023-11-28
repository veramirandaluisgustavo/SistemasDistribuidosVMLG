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
        Schema::create('ficha', function (Blueprint $table) {
            $table->id("ci");
            $table->String("nombre");
            $table->unsignedBigInteger("cola_id")->nullable();
            $table->String("estado")->default("pendiente");
            $table->timestamps();

            $table->foreign("cola_id")->references('id')->on('cola');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('ficha');
    }
};
