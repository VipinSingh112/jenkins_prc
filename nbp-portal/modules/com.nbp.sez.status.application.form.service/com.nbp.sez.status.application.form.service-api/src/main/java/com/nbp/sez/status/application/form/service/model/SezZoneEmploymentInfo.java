/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezZoneEmploymentInfo service. Represents a row in the &quot;nbp_sez_zone_employment_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmploymentInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezZoneEmploymentInfoImpl"
)
@ProviderType
public interface SezZoneEmploymentInfo
	extends PersistedModel, SezZoneEmploymentInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmploymentInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezZoneEmploymentInfo, Long>
		SEZ_ZONE_EMPLOYMENT_INFO_ID_ACCESSOR =
			new Accessor<SezZoneEmploymentInfo, Long>() {

				@Override
				public Long get(SezZoneEmploymentInfo sezZoneEmploymentInfo) {
					return sezZoneEmploymentInfo.getSezZoneEmploymentInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezZoneEmploymentInfo> getTypeClass() {
					return SezZoneEmploymentInfo.class;
				}

			};

}