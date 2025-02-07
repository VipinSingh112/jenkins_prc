/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireLandPropertyDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetailsLocalService
 * @generated
 */
public class AcquireLandPropertyDetailsLocalServiceWrapper
	implements AcquireLandPropertyDetailsLocalService,
			   ServiceWrapper<AcquireLandPropertyDetailsLocalService> {

	public AcquireLandPropertyDetailsLocalServiceWrapper() {
		this(null);
	}

	public AcquireLandPropertyDetailsLocalServiceWrapper(
		AcquireLandPropertyDetailsLocalService
			acquireLandPropertyDetailsLocalService) {

		_acquireLandPropertyDetailsLocalService =
			acquireLandPropertyDetailsLocalService;
	}

	/**
	 * Adds the acquire land property details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandPropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 * @return the acquire land property details that was added
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails addAcquireLandPropertyDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return _acquireLandPropertyDetailsLocalService.
			addAcquireLandPropertyDetails(acquireLandPropertyDetails);
	}

	/**
	 * Creates a new acquire land property details with the primary key. Does not add the acquire land property details to the database.
	 *
	 * @param acquireLandPropertyDetailsId the primary key for the new acquire land property details
	 * @return the new acquire land property details
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails createAcquireLandPropertyDetails(
				long acquireLandPropertyDetailsId) {

		return _acquireLandPropertyDetailsLocalService.
			createAcquireLandPropertyDetails(acquireLandPropertyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandPropertyDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire land property details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandPropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 * @return the acquire land property details that was removed
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails deleteAcquireLandPropertyDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return _acquireLandPropertyDetailsLocalService.
			deleteAcquireLandPropertyDetails(acquireLandPropertyDetails);
	}

	/**
	 * Deletes the acquire land property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandPropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details that was removed
	 * @throws PortalException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails deleteAcquireLandPropertyDetails(
					long acquireLandPropertyDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandPropertyDetailsLocalService.
			deleteAcquireLandPropertyDetails(acquireLandPropertyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandPropertyDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireLandPropertyDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireLandPropertyDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireLandPropertyDetailsLocalService.dynamicQuery();
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

		return _acquireLandPropertyDetailsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsModelImpl</code>.
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

		return _acquireLandPropertyDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsModelImpl</code>.
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

		return _acquireLandPropertyDetailsLocalService.dynamicQuery(
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

		return _acquireLandPropertyDetailsLocalService.dynamicQueryCount(
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

		return _acquireLandPropertyDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails fetchAcquireLandPropertyDetails(
				long acquireLandPropertyDetailsId) {

		return _acquireLandPropertyDetailsLocalService.
			fetchAcquireLandPropertyDetails(acquireLandPropertyDetailsId);
	}

	/**
	 * Returns the acquire land property details with the primary key.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details
	 * @throws PortalException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails getAcquireLandPropertyDetails(
					long acquireLandPropertyDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandPropertyDetailsLocalService.
			getAcquireLandPropertyDetails(acquireLandPropertyDetailsId);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails getAcquireLandPropertyDetailsById(
					long acquireApplicationId)
				throws com.nbp.acquire.application.form.service.exception.
					NoSuchAcquireLandPropertyDetailsException {

		return _acquireLandPropertyDetailsLocalService.
			getAcquireLandPropertyDetailsById(acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @return the range of acquire land property detailses
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails> getAcquireLandPropertyDetailses(
				int start, int end) {

		return _acquireLandPropertyDetailsLocalService.
			getAcquireLandPropertyDetailses(start, end);
	}

	/**
	 * Returns the number of acquire land property detailses.
	 *
	 * @return the number of acquire land property detailses
	 */
	@Override
	public int getAcquireLandPropertyDetailsesCount() {
		return _acquireLandPropertyDetailsLocalService.
			getAcquireLandPropertyDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireLandPropertyDetailsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireLandPropertyDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandPropertyDetailsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandPropertyDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire land property details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandPropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 * @return the acquire land property details that was updated
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandPropertyDetails updateAcquireLandPropertyDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return _acquireLandPropertyDetailsLocalService.
			updateAcquireLandPropertyDetails(acquireLandPropertyDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireLandPropertyDetailsLocalService.getBasePersistence();
	}

	@Override
	public AcquireLandPropertyDetailsLocalService getWrappedService() {
		return _acquireLandPropertyDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireLandPropertyDetailsLocalService
			acquireLandPropertyDetailsLocalService) {

		_acquireLandPropertyDetailsLocalService =
			acquireLandPropertyDetailsLocalService;
	}

	private AcquireLandPropertyDetailsLocalService
		_acquireLandPropertyDetailsLocalService;

}