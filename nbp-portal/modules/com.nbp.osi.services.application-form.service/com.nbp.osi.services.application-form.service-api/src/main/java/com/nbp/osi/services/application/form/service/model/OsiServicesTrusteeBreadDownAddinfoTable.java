/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_tru_brak_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfo
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoTable
	extends BaseTable<OsiServicesTrusteeBreadDownAddinfoTable> {

	public static final OsiServicesTrusteeBreadDownAddinfoTable INSTANCE =
		new OsiServicesTrusteeBreadDownAddinfoTable();

	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Long>
		osiTrusId = createColumn(
			"osiTrusId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		breakdownWorkingYear = createColumn(
			"breakdownWorkingYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		workingBankrupties = createColumn(
			"workingBankrupties", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		workingProposal = createColumn(
			"workingProposal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		workingComBankrupts = createColumn(
			"workingComBankrupts", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		workingComProposal = createColumn(
			"workingComProposal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		workingInterimReceive = createColumn(
			"workingInterimReceive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		breakdownWorkingCreditors = createColumn(
			"breakdownWorkingCreditors", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		breakdownWorkingOther = createColumn(
			"breakdownWorkingOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, String>
		counter = createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeBreadDownAddinfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesTrusteeBreadDownAddinfoTable() {
		super(
			"nbp_osi_services_tru_brak_add",
			OsiServicesTrusteeBreadDownAddinfoTable::new);
	}

}