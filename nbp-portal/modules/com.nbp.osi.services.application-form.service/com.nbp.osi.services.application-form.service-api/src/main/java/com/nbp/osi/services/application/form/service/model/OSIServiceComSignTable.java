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
 * The table class for the &quot;nbp_osi_services_trus_com_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSign
 * @generated
 */
public class OSIServiceComSignTable extends BaseTable<OSIServiceComSignTable> {

	public static final OSIServiceComSignTable INSTANCE =
		new OSIServiceComSignTable();

	public final Column<OSIServiceComSignTable, Long> osiComSignId =
		createColumn(
			"osiComSignId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OSIServiceComSignTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Date> comSignDate =
		createColumn(
			"comSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServiceComSignTable, Long> osiServicesApplicationId =
		createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OSIServiceComSignTable() {
		super("nbp_osi_services_trus_com_sign", OSIServiceComSignTable::new);
	}

}