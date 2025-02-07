/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_cer_scope_ser&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeService
 * @generated
 */
public class AddCerScopeServiceTable
	extends BaseTable<AddCerScopeServiceTable> {

	public static final AddCerScopeServiceTable INSTANCE =
		new AddCerScopeServiceTable();

	public final Column<AddCerScopeServiceTable, Long> addCerScopeServiceId =
		createColumn(
			"addCerScopeServiceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddCerScopeServiceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, String> clientOrganization =
		createColumn(
			"clientOrganization", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, String>
		certificationStandards = createColumn(
			"certificationStandards", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, String> currentCertification =
		createColumn(
			"currentCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Date> dateFirstGranted =
		createColumn(
			"dateFirstGranted", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddCerScopeServiceTable() {
		super("nbp_janaac_add_cer_scope_ser", AddCerScopeServiceTable::new);
	}

}