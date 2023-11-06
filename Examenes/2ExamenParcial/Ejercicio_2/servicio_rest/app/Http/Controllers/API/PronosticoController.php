<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use App\Models\Pronostico;
use Illuminate\Http\Request;

class PronosticoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Pronostico::all();
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Pronostico::create($request->all());
        return response()->json([
            "res"=>true,
            "msg"=>"pronostico guardado correctamente"

        ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Pronostico $pronostico)
    {
        return response()->json([
            "res"=>true,
            "pronostico"=>$pronostico
        ],200);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Pronostico $pronostico)
    {
        $pronostico->update($request->all());
        return response()->json([
            "res"=>true,
            "msg"=>"pronostico actualizado correctamente"
        ],200);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Pronostico $pronostico)
    {
        $pronostico->delete();
        return response()->json([
            "res"=>true,
            "msg"=>"Se borro correctamente"
        ]);
    }
}
