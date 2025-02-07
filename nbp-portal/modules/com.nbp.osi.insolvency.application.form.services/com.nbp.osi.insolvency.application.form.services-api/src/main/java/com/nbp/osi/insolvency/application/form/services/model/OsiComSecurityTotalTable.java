/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_insolv_com_security_tot&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotal
 * @generated
 */
public class OsiComSecurityTotalTable
	extends BaseTable<OsiComSecurityTotalTable> {

	public static final OsiComSecurityTotalTable INSTANCE =
		new OsiComSecurityTotalTable();

	public final Column<OsiComSecurityTotalTable, Long> osiComSecurityTotalId =
		createColumn(
			"osiComSecurityTotalId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiComSecurityTotalTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, String> comSecuritTotal =
		createColumn(
			"comSecuritTotal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, String> comAssetTotal =
		createColumn(
			"comAssetTotal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, String> comSecuritTotalValue =
		createColumn(
			"comSecuritTotalValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiComSecurityTotalTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiComSecurityTotalTable() {
		super("nbp_insolv_com_security_tot", OsiComSecurityTotalTable::new);
	}

}