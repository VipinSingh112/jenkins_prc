/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDeveloperDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsLocalService
 * @generated
 */
public class SezDeveloperDetailsLocalServiceWrapper
	implements ServiceWrapper<SezDeveloperDetailsLocalService>,
			   SezDeveloperDetailsLocalService {

	public SezDeveloperDetailsLocalServiceWrapper() {
		this(null);
	}

	public SezDeveloperDetailsLocalServiceWrapper(
		SezDeveloperDetailsLocalService sezDeveloperDetailsLocalService) {

		_sezDeveloperDetailsLocalService = sezDeveloperDetailsLocalService;
	}

	/**
	 * Adds the sez developer details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
		addSezDeveloperDetails(
			com.nbp.sez.status.application.form.service.model.
				SezDeveloperDetails sezDeveloperDetails) {

		return _sezDeveloperDetailsLocalService.addSezDeveloperDetails(
			sezDeveloperDetails);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez developer details with the primary key. Does not add the sez developer details to the database.
	 *
	 * @param sezDeveloperDetailsId the primary key for the new sez developer details
	 * @return the new sez developer details
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
		createSezDeveloperDetails(long sezDeveloperDetailsId) {

		return _sezDeveloperDetailsLocalService.createSezDeveloperDetails(
			sezDeveloperDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws PortalException if a sez developer details with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
			deleteSezDeveloperDetails(long sezDeveloperDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperDetailsLocalService.deleteSezDeveloperDetails(
			sezDeveloperDetailsId);
	}

	/**
	 * Deletes the sez developer details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
		deleteSezDeveloperDetails(
			com.nbp.sez.status.application.form.service.model.
				SezDeveloperDetails sezDeveloperDetails) {

		return _sezDeveloperDetailsLocalService.deleteSezDeveloperDetails(
			sezDeveloperDetails);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDeveloperDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDeveloperDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDeveloperDetailsLocalService.dynamicQuery();
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

		return _sezDeveloperDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
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

		return _sezDeveloperDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
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

		return _sezDeveloperDetailsLocalService.dynamicQuery(
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

		return _sezDeveloperDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezDeveloperDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
		fetchSezDeveloperDetails(long sezDeveloperDetailsId) {

		return _sezDeveloperDetailsLocalService.fetchSezDeveloperDetails(
			sezDeveloperDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDeveloperDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
			getDeveloperDetailsBy_Id(long sezApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return _sezDeveloperDetailsLocalService.getDeveloperDetailsBy_Id(
			sezApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDeveloperDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDeveloperDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez developer details with the primary key.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws PortalException if a sez developer details with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
			getSezDeveloperDetails(long sezDeveloperDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperDetailsLocalService.getSezDeveloperDetails(
			sezDeveloperDetailsId);
	}

	/**
	 * Returns a range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @return the range of sez developer detailses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezDeveloperDetails>
			getSezDeveloperDetailses(int start, int end) {

		return _sezDeveloperDetailsLocalService.getSezDeveloperDetailses(
			start, end);
	}

	/**
	 * Returns the number of sez developer detailses.
	 *
	 * @return the number of sez developer detailses
	 */
	@Override
	public int getSezDeveloperDetailsesCount() {
		return _sezDeveloperDetailsLocalService.getSezDeveloperDetailsesCount();
	}

	/**
	 * Updates the sez developer details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezDeveloperDetails
		updateSezDeveloperDetails(
			com.nbp.sez.status.application.form.service.model.
				SezDeveloperDetails sezDeveloperDetails) {

		return _sezDeveloperDetailsLocalService.updateSezDeveloperDetails(
			sezDeveloperDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDeveloperDetailsLocalService.getBasePersistence();
	}

	@Override
	public SezDeveloperDetailsLocalService getWrappedService() {
		return _sezDeveloperDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		SezDeveloperDetailsLocalService sezDeveloperDetailsLocalService) {

		_sezDeveloperDetailsLocalService = sezDeveloperDetailsLocalService;
	}

	private SezDeveloperDetailsLocalService _sezDeveloperDetailsLocalService;

}