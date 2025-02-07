/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjAddLocMultiSite. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjAddLocMultiSiteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSiteLocalService
 * @generated
 */
public class NcbjAddLocMultiSiteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjAddLocMultiSiteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj add loc multi site to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAddLocMultiSiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAddLocMultiSite the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was added
	 */
	public static NcbjAddLocMultiSite addNcbjAddLocMultiSite(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return getService().addNcbjAddLocMultiSite(ncbjAddLocMultiSite);
	}

	/**
	 * Creates a new ncbj add loc multi site with the primary key. Does not add the ncbj add loc multi site to the database.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key for the new ncbj add loc multi site
	 * @return the new ncbj add loc multi site
	 */
	public static NcbjAddLocMultiSite createNcbjAddLocMultiSite(
		long ncbjAddLocMultiSiteId) {

		return getService().createNcbjAddLocMultiSite(ncbjAddLocMultiSiteId);
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
	 * Deletes the ncbj add loc multi site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAddLocMultiSiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was removed
	 * @throws PortalException if a ncbj add loc multi site with the primary key could not be found
	 */
	public static NcbjAddLocMultiSite deleteNcbjAddLocMultiSite(
			long ncbjAddLocMultiSiteId)
		throws PortalException {

		return getService().deleteNcbjAddLocMultiSite(ncbjAddLocMultiSiteId);
	}

	/**
	 * Deletes the ncbj add loc multi site from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAddLocMultiSiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAddLocMultiSite the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was removed
	 */
	public static NcbjAddLocMultiSite deleteNcbjAddLocMultiSite(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return getService().deleteNcbjAddLocMultiSite(ncbjAddLocMultiSite);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAddLocMultiSiteModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAddLocMultiSiteModelImpl</code>.
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

	public static NcbjAddLocMultiSite fetchNcbjAddLocMultiSite(
		long ncbjAddLocMultiSiteId) {

		return getService().fetchNcbjAddLocMultiSite(ncbjAddLocMultiSiteId);
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
	 * Returns the ncbj add loc multi site with the primary key.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site
	 * @throws PortalException if a ncbj add loc multi site with the primary key could not be found
	 */
	public static NcbjAddLocMultiSite getNcbjAddLocMultiSite(
			long ncbjAddLocMultiSiteId)
		throws PortalException {

		return getService().getNcbjAddLocMultiSite(ncbjAddLocMultiSiteId);
	}

	/**
	 * Returns a range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @return the range of ncbj add loc multi sites
	 */
	public static List<NcbjAddLocMultiSite> getNcbjAddLocMultiSites(
		int start, int end) {

		return getService().getNcbjAddLocMultiSites(start, end);
	}

	/**
	 * Returns the number of ncbj add loc multi sites.
	 *
	 * @return the number of ncbj add loc multi sites
	 */
	public static int getNcbjAddLocMultiSitesCount() {
		return getService().getNcbjAddLocMultiSitesCount();
	}

	public static NcbjAddLocMultiSite getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return getService().getNCBJByAppId(ncbjApplicationId);
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
	 * Updates the ncbj add loc multi site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjAddLocMultiSiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAddLocMultiSite the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was updated
	 */
	public static NcbjAddLocMultiSite updateNcbjAddLocMultiSite(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return getService().updateNcbjAddLocMultiSite(ncbjAddLocMultiSite);
	}

	public static NcbjAddLocMultiSiteLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjAddLocMultiSiteLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjAddLocMultiSiteLocalServiceUtil.class,
			NcbjAddLocMultiSiteLocalService.class);

}