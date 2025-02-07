/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgriculturePoultry service. Represents a row in the &quot;agriculture_poultry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultryModel
 * @generated
 */
@ImplementationClassName(
	"com.agriculture.application.form.service.model.impl.AgriculturePoultryImpl"
)
@ProviderType
public interface AgriculturePoultry
	extends AgriculturePoultryModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.agriculture.application.form.service.model.impl.AgriculturePoultryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgriculturePoultry, Long>
		AGRICULTURE_POULTRY_ID_ACCESSOR =
			new Accessor<AgriculturePoultry, Long>() {

				@Override
				public Long get(AgriculturePoultry agriculturePoultry) {
					return agriculturePoultry.getAgriculturePoultryId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgriculturePoultry> getTypeClass() {
					return AgriculturePoultry.class;
				}

			};

}