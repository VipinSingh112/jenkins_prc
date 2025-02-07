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
 * The extended model interface for the AgricultureOrnamental service. Represents a row in the &quot;agriculture_ornamental&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamentalModel
 * @generated
 */
@ImplementationClassName(
	"com.agriculture.application.form.service.model.impl.AgricultureOrnamentalImpl"
)
@ProviderType
public interface AgricultureOrnamental
	extends AgricultureOrnamentalModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.agriculture.application.form.service.model.impl.AgricultureOrnamentalImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgricultureOrnamental, Long>
		AGRICULTURE_ORNAMENTAL_ID_ACCESSOR =
			new Accessor<AgricultureOrnamental, Long>() {

				@Override
				public Long get(AgricultureOrnamental agricultureOrnamental) {
					return agricultureOrnamental.getAgricultureOrnamentalId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgricultureOrnamental> getTypeClass() {
					return AgricultureOrnamental.class;
				}

			};

}