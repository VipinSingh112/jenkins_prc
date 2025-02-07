/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisConsentBySoleOwnerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerLocalService
 * @generated
 */
public class CannabisConsentBySoleOwnerLocalServiceWrapper
	implements CannabisConsentBySoleOwnerLocalService,
			   ServiceWrapper<CannabisConsentBySoleOwnerLocalService> {

	public CannabisConsentBySoleOwnerLocalServiceWrapper() {
		this(null);
	}

	public CannabisConsentBySoleOwnerLocalServiceWrapper(
		CannabisConsentBySoleOwnerLocalService
			cannabisConsentBySoleOwnerLocalService) {

		_cannabisConsentBySoleOwnerLocalService =
			cannabisConsentBySoleOwnerLocalService;
	}

	/**
	 * Adds the cannabis consent by sole owner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was added
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner addCannabisConsentBySoleOwner(
				com.nbp.cannabis.application.form.services.model.
					CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return _cannabisConsentBySoleOwnerLocalService.
			addCannabisConsentBySoleOwner(cannabisConsentBySoleOwner);
	}

	/**
	 * Creates a new cannabis consent by sole owner with the primary key. Does not add the cannabis consent by sole owner to the database.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key for the new cannabis consent by sole owner
	 * @return the new cannabis consent by sole owner
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner createCannabisConsentBySoleOwner(
				long cannabisConsentBySoleOwnerId) {

		return _cannabisConsentBySoleOwnerLocalService.
			createCannabisConsentBySoleOwner(cannabisConsentBySoleOwnerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentBySoleOwnerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis consent by sole owner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner deleteCannabisConsentBySoleOwner(
				com.nbp.cannabis.application.form.services.model.
					CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return _cannabisConsentBySoleOwnerLocalService.
			deleteCannabisConsentBySoleOwner(cannabisConsentBySoleOwner);
	}

	/**
	 * Deletes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws PortalException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner deleteCannabisConsentBySoleOwner(
					long cannabisConsentBySoleOwnerId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentBySoleOwnerLocalService.
			deleteCannabisConsentBySoleOwner(cannabisConsentBySoleOwnerId);
	}

	@Override
	public void deleteCS_CSO_CAI(long cannabisApplicationId) {
		_cannabisConsentBySoleOwnerLocalService.deleteCS_CSO_CAI(
			cannabisApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentBySoleOwnerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisConsentBySoleOwnerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisConsentBySoleOwnerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisConsentBySoleOwnerLocalService.dynamicQuery();
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

		return _cannabisConsentBySoleOwnerLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
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

		return _cannabisConsentBySoleOwnerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
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

		return _cannabisConsentBySoleOwnerLocalService.dynamicQuery(
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

		return _cannabisConsentBySoleOwnerLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _cannabisConsentBySoleOwnerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner fetchCannabisConsentBySoleOwner(
				long cannabisConsentBySoleOwnerId) {

		return _cannabisConsentBySoleOwnerLocalService.
			fetchCannabisConsentBySoleOwner(cannabisConsentBySoleOwnerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisConsentBySoleOwnerLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner> getCA_CSO_BY_CAI(
				long cannabisApplicationId) {

		return _cannabisConsentBySoleOwnerLocalService.getCA_CSO_BY_CAI(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws PortalException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner getCannabisConsentBySoleOwner(
					long cannabisConsentBySoleOwnerId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentBySoleOwnerLocalService.
			getCannabisConsentBySoleOwner(cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of cannabis consent by sole owners
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner> getCannabisConsentBySoleOwners(
				int start, int end) {

		return _cannabisConsentBySoleOwnerLocalService.
			getCannabisConsentBySoleOwners(start, end);
	}

	/**
	 * Returns the number of cannabis consent by sole owners.
	 *
	 * @return the number of cannabis consent by sole owners
	 */
	@Override
	public int getCannabisConsentBySoleOwnersCount() {
		return _cannabisConsentBySoleOwnerLocalService.
			getCannabisConsentBySoleOwnersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisConsentBySoleOwnerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConsentBySoleOwnerLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConsentBySoleOwnerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis consent by sole owner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was updated
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			CannabisConsentBySoleOwner updateCannabisConsentBySoleOwner(
				com.nbp.cannabis.application.form.services.model.
					CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return _cannabisConsentBySoleOwnerLocalService.
			updateCannabisConsentBySoleOwner(cannabisConsentBySoleOwner);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisConsentBySoleOwnerLocalService.getBasePersistence();
	}

	@Override
	public CannabisConsentBySoleOwnerLocalService getWrappedService() {
		return _cannabisConsentBySoleOwnerLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisConsentBySoleOwnerLocalService
			cannabisConsentBySoleOwnerLocalService) {

		_cannabisConsentBySoleOwnerLocalService =
			cannabisConsentBySoleOwnerLocalService;
	}

	private CannabisConsentBySoleOwnerLocalService
		_cannabisConsentBySoleOwnerLocalService;

}