<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use App\Http\Requests\GuardarMedicoRequest;
use App\Models\Medico;
use Illuminate\Http\Request;

class MedicoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Medico::all();
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(GuardarMedicoRequest $request)
    {
        Medico::create($request->all());
        return response()->json([
            "msg"=>"Medico guardado correctamente"

        ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Medico $clima)
    {
        return response()->json([
            "clima"=>$clima
        ],200);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Medico $medico)
    {
        $medico->update($request->all());
        return response()->json([
            "msg"=>"paciente actualizado correctamente"
        ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Medico $medico)
    {
        $medico->delete();
        return response()->json([
            "msg"=>"Se borro correctamente"
        ]);
    }
}
