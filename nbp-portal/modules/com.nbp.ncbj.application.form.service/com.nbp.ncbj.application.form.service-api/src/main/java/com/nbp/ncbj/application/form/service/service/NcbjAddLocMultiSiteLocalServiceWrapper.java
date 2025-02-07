/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjAddLocMultiSiteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSiteLocalService
 * @generated
 */
public class NcbjAddLocMultiSiteLocalServiceWrapper
	implements NcbjAddLocMultiSiteLocalService,
			   ServiceWrapper<NcbjAddLocMultiSiteLocalService> {

	public NcbjAddLocMultiSiteLocalServiceWrapper() {
		this(null);
	}

	public NcbjAddLocMultiSiteLocalServiceWrapper(
		NcbjAddLocMultiSiteLocalService ncbjAddLocMultiSiteLocalService) {

		_ncbjAddLocMultiSiteLocalService = ncbjAddLocMultiSiteLocalService;
	}

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
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
		addNcbjAddLocMultiSite(
			com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
				ncbjAddLocMultiSite) {

		return _ncbjAddLocMultiSiteLocalService.addNcbjAddLocMultiSite(
			ncbjAddLocMultiSite);
	}

	/**
	 * Creates a new ncbj add loc multi site with the primary key. Does not add the ncbj add loc multi site to the database.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key for the new ncbj add loc multi site
	 * @return the new ncbj add loc multi site
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
		createNcbjAddLocMultiSite(long ncbjAddLocMultiSiteId) {

		return _ncbjAddLocMultiSiteLocalService.createNcbjAddLocMultiSite(
			ncbjAddLocMultiSiteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAddLocMultiSiteLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
			deleteNcbjAddLocMultiSite(long ncbjAddLocMultiSiteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAddLocMultiSiteLocalService.deleteNcbjAddLocMultiSite(
			ncbjAddLocMultiSiteId);
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
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
		deleteNcbjAddLocMultiSite(
			com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
				ncbjAddLocMultiSite) {

		return _ncbjAddLocMultiSiteLocalService.deleteNcbjAddLocMultiSite(
			ncbjAddLocMultiSite);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAddLocMultiSiteLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjAddLocMultiSiteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjAddLocMultiSiteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjAddLocMultiSiteLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _ncbjAddLocMultiSiteLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _ncbjAddLocMultiSiteLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _ncbjAddLocMultiSiteLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _ncbjAddLocMultiSiteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _ncbjAddLocMultiSiteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
		fetchNcbjAddLocMultiSite(long ncbjAddLocMultiSiteId) {

		return _ncbjAddLocMultiSiteLocalService.fetchNcbjAddLocMultiSite(
			ncbjAddLocMultiSiteId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjAddLocMultiSiteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjAddLocMultiSiteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj add loc multi site with the primary key.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site
	 * @throws PortalException if a ncbj add loc multi site with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
			getNcbjAddLocMultiSite(long ncbjAddLocMultiSiteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAddLocMultiSiteLocalService.getNcbjAddLocMultiSite(
			ncbjAddLocMultiSiteId);
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
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite>
			getNcbjAddLocMultiSites(int start, int end) {

		return _ncbjAddLocMultiSiteLocalService.getNcbjAddLocMultiSites(
			start, end);
	}

	/**
	 * Returns the number of ncbj add loc multi sites.
	 *
	 * @return the number of ncbj add loc multi sites
	 */
	@Override
	public int getNcbjAddLocMultiSitesCount() {
		return _ncbjAddLocMultiSiteLocalService.getNcbjAddLocMultiSitesCount();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return _ncbjAddLocMultiSiteLocalService.getNCBJByAppId(
			ncbjApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAddLocMultiSiteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjAddLocMultiSiteLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
		updateNcbjAddLocMultiSite(
			com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite
				ncbjAddLocMultiSite) {

		return _ncbjAddLocMultiSiteLocalService.updateNcbjAddLocMultiSite(
			ncbjAddLocMultiSite);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjAddLocMultiSiteLocalService.getBasePersistence();
	}

	@Override
	public NcbjAddLocMultiSiteLocalService getWrappedService() {
		return _ncbjAddLocMultiSiteLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjAddLocMultiSiteLocalService ncbjAddLocMultiSiteLocalService) {

		_ncbjAddLocMultiSiteLocalService = ncbjAddLocMultiSiteLocalService;
	}

	private NcbjAddLocMultiSiteLocalService _ncbjAddLocMultiSiteLocalService;

}