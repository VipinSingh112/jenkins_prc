/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionGenDeclareInfo. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionGenDeclareInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoLocalService
 * @generated
 */
public class AttractionGenDeclareInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionGenDeclareInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction gen declare info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was added
	 */
	public static AttractionGenDeclareInfo addAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return getService().addAttractionGenDeclareInfo(
			attractionGenDeclareInfo);
	}

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	public static AttractionGenDeclareInfo createAttractionGenDeclareInfo(
		long attractionGenDeclareInfoId) {

		return getService().createAttractionGenDeclareInfo(
			attractionGenDeclareInfoId);
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
	 * Deletes the attraction gen declare info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 */
	public static AttractionGenDeclareInfo deleteAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return getService().deleteAttractionGenDeclareInfo(
			attractionGenDeclareInfo);
	}

	/**
	 * Deletes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	public static AttractionGenDeclareInfo deleteAttractionGenDeclareInfo(
			long attractionGenDeclareInfoId)
		throws PortalException {

		return getService().deleteAttractionGenDeclareInfo(
			attractionGenDeclareInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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

	public static AttractionGenDeclareInfo fetchAttractionGenDeclareInfo(
		long attractionGenDeclareInfoId) {

		return getService().fetchAttractionGenDeclareInfo(
			attractionGenDeclareInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction gen declare info with the primary key.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	public static AttractionGenDeclareInfo getAttractionGenDeclareInfo(
			long attractionGenDeclareInfoId)
		throws PortalException {

		return getService().getAttractionGenDeclareInfo(
			attractionGenDeclareInfoId);
	}

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	public static List<AttractionGenDeclareInfo> getAttractionGenDeclareInfos(
		int start, int end) {

		return getService().getAttractionGenDeclareInfos(start, end);
	}

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
	 */
	public static int getAttractionGenDeclareInfosCount() {
		return getService().getAttractionGenDeclareInfosCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionGenDeclareInfo getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return getService().getJTB_ByApplicationId(jtbApplicationId);
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
	 * Updates the attraction gen declare info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was updated
	 */
	public static AttractionGenDeclareInfo updateAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return getService().updateAttractionGenDeclareInfo(
			attractionGenDeclareInfo);
	}

	public static AttractionGenDeclareInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionGenDeclareInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionGenDeclareInfoLocalServiceUtil.class,
			AttractionGenDeclareInfoLocalService.class);

}