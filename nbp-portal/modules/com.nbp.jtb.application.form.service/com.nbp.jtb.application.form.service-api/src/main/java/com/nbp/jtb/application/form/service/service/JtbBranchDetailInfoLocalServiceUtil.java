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

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JtbBranchDetailInfo. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.JtbBranchDetailInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfoLocalService
 * @generated
 */
public class JtbBranchDetailInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.JtbBranchDetailInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb branch detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was added
	 */
	public static JtbBranchDetailInfo addJtbBranchDetailInfo(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return getService().addJtbBranchDetailInfo(jtbBranchDetailInfo);
	}

	/**
	 * Creates a new jtb branch detail info with the primary key. Does not add the jtb branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb branch detail info
	 * @return the new jtb branch detail info
	 */
	public static JtbBranchDetailInfo createJtbBranchDetailInfo(
		long jtbBranchDetailInfoId) {

		return getService().createJtbBranchDetailInfo(jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jtb branch detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 */
	public static JtbBranchDetailInfo deleteJtbBranchDetailInfo(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return getService().deleteJtbBranchDetailInfo(jtbBranchDetailInfo);
	}

	/**
	 * Deletes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws PortalException if a jtb branch detail info with the primary key could not be found
	 */
	public static JtbBranchDetailInfo deleteJtbBranchDetailInfo(
			long jtbBranchDetailInfoId)
		throws PortalException {

		return getService().deleteJtbBranchDetailInfo(jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static JtbBranchDetailInfo fetchJtbBranchDetailInfo(
		long jtbBranchDetailInfoId) {

		return getService().fetchJtbBranchDetailInfo(jtbBranchDetailInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb branch detail info with the primary key.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws PortalException if a jtb branch detail info with the primary key could not be found
	 */
	public static JtbBranchDetailInfo getJtbBranchDetailInfo(
			long jtbBranchDetailInfoId)
		throws PortalException {

		return getService().getJtbBranchDetailInfo(jtbBranchDetailInfoId);
	}

	/**
	 * Returns a range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @return the range of jtb branch detail infos
	 */
	public static List<JtbBranchDetailInfo> getJtbBranchDetailInfos(
		int start, int end) {

		return getService().getJtbBranchDetailInfos(start, end);
	}

	/**
	 * Returns the number of jtb branch detail infos.
	 *
	 * @return the number of jtb branch detail infos
	 */
	public static int getJtbBranchDetailInfosCount() {
		return getService().getJtbBranchDetailInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jtb branch detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was updated
	 */
	public static JtbBranchDetailInfo updateJtbBranchDetailInfo(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return getService().updateJtbBranchDetailInfo(jtbBranchDetailInfo);
	}

	public static JtbBranchDetailInfoLocalService getService() {
		return _service;
	}

	private static volatile JtbBranchDetailInfoLocalService _service;

}