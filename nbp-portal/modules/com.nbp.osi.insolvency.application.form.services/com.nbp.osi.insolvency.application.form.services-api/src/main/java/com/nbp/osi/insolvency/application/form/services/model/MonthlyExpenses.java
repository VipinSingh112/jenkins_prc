/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MonthlyExpenses service. Represents a row in the &quot;nbp_osi_monthly_expense&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesImpl"
)
@ProviderType
public interface MonthlyExpenses extends MonthlyExpensesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MonthlyExpenses, Long>
		MONTHLY_EXPENSES_ID_ACCESSOR = new Accessor<MonthlyExpenses, Long>() {

			@Override
			public Long get(MonthlyExpenses monthlyExpenses) {
				return monthlyExpenses.getMonthlyExpensesId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MonthlyExpenses> getTypeClass() {
				return MonthlyExpenses.class;
			}

		};

}