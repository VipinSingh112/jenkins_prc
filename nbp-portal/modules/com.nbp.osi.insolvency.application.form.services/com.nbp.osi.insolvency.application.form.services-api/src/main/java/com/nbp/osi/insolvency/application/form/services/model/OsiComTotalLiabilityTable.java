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
 * The table class for the &quot;nbp_osi_insolv_tot_liablity&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiability
 * @generated
 */
public class OsiComTotalLiabilityTable
	extends BaseTable<OsiComTotalLiabilityTable> {

	public static final OsiComTotalLiabilityTable INSTANCE =
		new OsiComTotalLiabilityTable();

	public final Column<OsiComTotalLiabilityTable, Long>
		osiComTotalLiabilityId = createColumn(
			"osiComTotalLiabilityId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiComTotalLiabilityTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, String> totalLiability =
		createColumn(
			"totalLiability", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiComTotalLiabilityTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiComTotalLiabilityTable() {
		super("nbp_osi_insolv_tot_liablity", OsiComTotalLiabilityTable::new);
	}

}