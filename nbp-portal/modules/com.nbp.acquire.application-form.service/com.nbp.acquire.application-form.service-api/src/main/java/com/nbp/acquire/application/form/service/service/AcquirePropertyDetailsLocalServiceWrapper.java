/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquirePropertyDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsLocalService
 * @generated
 */
public class AcquirePropertyDetailsLocalServiceWrapper
	implements AcquirePropertyDetailsLocalService,
			   ServiceWrapper<AcquirePropertyDetailsLocalService> {

	public AcquirePropertyDetailsLocalServiceWrapper() {
		this(null);
	}

	public AcquirePropertyDetailsLocalServiceWrapper(
		AcquirePropertyDetailsLocalService acquirePropertyDetailsLocalService) {

		_acquirePropertyDetailsLocalService =
			acquirePropertyDetailsLocalService;
	}

	/**
	 * Adds the acquire property details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePropertyDetails the acquire property details
	 * @return the acquire property details that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
		addAcquirePropertyDetails(
			com.nbp.acquire.application.form.service.model.
				AcquirePropertyDetails acquirePropertyDetails) {

		return _acquirePropertyDetailsLocalService.addAcquirePropertyDetails(
			acquirePropertyDetails);
	}

	/**
	 * Creates a new acquire property details with the primary key. Does not add the acquire property details to the database.
	 *
	 * @param acquirePropertyDetailsId the primary key for the new acquire property details
	 * @return the new acquire property details
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
		createAcquirePropertyDetails(long acquirePropertyDetailsId) {

		return _acquirePropertyDetailsLocalService.createAcquirePropertyDetails(
			acquirePropertyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePropertyDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire property details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePropertyDetails the acquire property details
	 * @return the acquire property details that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
		deleteAcquirePropertyDetails(
			com.nbp.acquire.application.form.service.model.
				AcquirePropertyDetails acquirePropertyDetails) {

		return _acquirePropertyDetailsLocalService.deleteAcquirePropertyDetails(
			acquirePropertyDetails);
	}

	/**
	 * Deletes the acquire property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details that was removed
	 * @throws PortalException if a acquire property details with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
			deleteAcquirePropertyDetails(long acquirePropertyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePropertyDetailsLocalService.deleteAcquirePropertyDetails(
			acquirePropertyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePropertyDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquirePropertyDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquirePropertyDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquirePropertyDetailsLocalService.dynamicQuery();
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

		return _acquirePropertyDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsModelImpl</code>.
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

		return _acquirePropertyDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsModelImpl</code>.
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

		return _acquirePropertyDetailsLocalService.dynamicQuery(
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

		return _acquirePropertyDetailsLocalService.dynamicQueryCount(
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

		return _acquirePropertyDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
		fetchAcquirePropertyDetails(long acquirePropertyDetailsId) {

		return _acquirePropertyDetailsLocalService.fetchAcquirePropertyDetails(
			acquirePropertyDetailsId);
	}

	/**
	 * Returns the acquire property details with the primary key.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details
	 * @throws PortalException if a acquire property details with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
			getAcquirePropertyDetails(long acquirePropertyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePropertyDetailsLocalService.getAcquirePropertyDetails(
			acquirePropertyDetailsId);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
			getAcquirePropertyDetailsById(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return _acquirePropertyDetailsLocalService.
			getAcquirePropertyDetailsById(acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @return the range of acquire property detailses
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquirePropertyDetails>
			getAcquirePropertyDetailses(int start, int end) {

		return _acquirePropertyDetailsLocalService.getAcquirePropertyDetailses(
			start, end);
	}

	/**
	 * Returns the number of acquire property detailses.
	 *
	 * @return the number of acquire property detailses
	 */
	@Override
	public int getAcquirePropertyDetailsesCount() {
		return _acquirePropertyDetailsLocalService.
			getAcquirePropertyDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquirePropertyDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquirePropertyDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePropertyDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquirePropertyDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire property details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquirePropertyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquirePropertyDetails the acquire property details
	 * @return the acquire property details that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquirePropertyDetails
		updateAcquirePropertyDetails(
			com.nbp.acquire.application.form.service.model.
				AcquirePropertyDetails acquirePropertyDetails) {

		return _acquirePropertyDetailsLocalService.updateAcquirePropertyDetails(
			acquirePropertyDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquirePropertyDetailsLocalService.getBasePersistence();
	}

	@Override
	public AcquirePropertyDetailsLocalService getWrappedService() {
		return _acquirePropertyDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AcquirePropertyDetailsLocalService acquirePropertyDetailsLocalService) {

		_acquirePropertyDetailsLocalService =
			acquirePropertyDetailsLocalService;
	}

	private AcquirePropertyDetailsLocalService
		_acquirePropertyDetailsLocalService;

}