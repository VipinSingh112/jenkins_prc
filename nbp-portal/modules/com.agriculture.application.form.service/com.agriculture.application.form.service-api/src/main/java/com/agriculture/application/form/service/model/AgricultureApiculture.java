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
 * The extended model interface for the AgricultureApiculture service. Represents a row in the &quot;agriculture_apiculture&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApicultureModel
 * @generated
 */
@ImplementationClassName(
	"com.agriculture.application.form.service.model.impl.AgricultureApicultureImpl"
)
@ProviderType
public interface AgricultureApiculture
	extends AgricultureApicultureModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.agriculture.application.form.service.model.impl.AgricultureApicultureImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgricultureApiculture, Long>
		AGRICULTURE_APICULTURE_ID_ACCESSOR =
			new Accessor<AgricultureApiculture, Long>() {

				@Override
				public Long get(AgricultureApiculture agricultureApiculture) {
					return agricultureApiculture.getAgricultureApicultureId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgricultureApiculture> getTypeClass() {
					return AgricultureApiculture.class;
				}

			};

}