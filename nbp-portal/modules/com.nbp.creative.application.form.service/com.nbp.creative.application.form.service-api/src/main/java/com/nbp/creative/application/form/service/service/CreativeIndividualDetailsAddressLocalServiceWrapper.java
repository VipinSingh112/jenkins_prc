/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeIndividualDetailsAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressLocalService
 * @generated
 */
public class CreativeIndividualDetailsAddressLocalServiceWrapper
	implements CreativeIndividualDetailsAddressLocalService,
			   ServiceWrapper<CreativeIndividualDetailsAddressLocalService> {

	public CreativeIndividualDetailsAddressLocalServiceWrapper() {
		this(null);
	}

	public CreativeIndividualDetailsAddressLocalServiceWrapper(
		CreativeIndividualDetailsAddressLocalService
			creativeIndividualDetailsAddressLocalService) {

		_creativeIndividualDetailsAddressLocalService =
			creativeIndividualDetailsAddressLocalService;
	}

	/**
	 * Adds the creative individual details address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress addCreativeIndividualDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualDetailsAddress
					creativeIndividualDetailsAddress) {

		return _creativeIndividualDetailsAddressLocalService.
			addCreativeIndividualDetailsAddress(
				creativeIndividualDetailsAddress);
	}

	/**
	 * Creates a new creative individual details address with the primary key. Does not add the creative individual details address to the database.
	 *
	 * @param creativeIndiDetailsAddressId the primary key for the new creative individual details address
	 * @return the new creative individual details address
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress createCreativeIndividualDetailsAddress(
			long creativeIndiDetailsAddressId) {

		return _creativeIndividualDetailsAddressLocalService.
			createCreativeIndividualDetailsAddress(
				creativeIndiDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative individual details address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress deleteCreativeIndividualDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualDetailsAddress
					creativeIndividualDetailsAddress) {

		return _creativeIndividualDetailsAddressLocalService.
			deleteCreativeIndividualDetailsAddress(
				creativeIndividualDetailsAddress);
	}

	/**
	 * Deletes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws PortalException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress deleteCreativeIndividualDetailsAddress(
				long creativeIndiDetailsAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsAddressLocalService.
			deleteCreativeIndividualDetailsAddress(
				creativeIndiDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeIndividualDetailsAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeIndividualDetailsAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeIndividualDetailsAddressLocalService.dynamicQuery();
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

		return _creativeIndividualDetailsAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
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

		return _creativeIndividualDetailsAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
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

		return _creativeIndividualDetailsAddressLocalService.dynamicQuery(
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

		return _creativeIndividualDetailsAddressLocalService.dynamicQueryCount(
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

		return _creativeIndividualDetailsAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress fetchCreativeIndividualDetailsAddress(
			long creativeIndiDetailsAddressId) {

		return _creativeIndividualDetailsAddressLocalService.
			fetchCreativeIndividualDetailsAddress(creativeIndiDetailsAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeIndividualDetailsAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress getCreativeCompanyAddressById(
			long creativeApplicationId) {

		return _creativeIndividualDetailsAddressLocalService.
			getCreativeCompanyAddressById(creativeApplicationId);
	}

	/**
	 * Returns the creative individual details address with the primary key.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws PortalException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress getCreativeIndividualDetailsAddress(
				long creativeIndiDetailsAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsAddressLocalService.
			getCreativeIndividualDetailsAddress(creativeIndiDetailsAddressId);
	}

	/**
	 * Returns a range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @return the range of creative individual details addresses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeIndividualDetailsAddress>
				getCreativeIndividualDetailsAddresses(int start, int end) {

		return _creativeIndividualDetailsAddressLocalService.
			getCreativeIndividualDetailsAddresses(start, end);
	}

	/**
	 * Returns the number of creative individual details addresses.
	 *
	 * @return the number of creative individual details addresses
	 */
	@Override
	public int getCreativeIndividualDetailsAddressesCount() {
		return _creativeIndividualDetailsAddressLocalService.
			getCreativeIndividualDetailsAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeIndividualDetailsAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualDetailsAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeIndividualDetailsAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative individual details address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress updateCreativeIndividualDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeIndividualDetailsAddress
					creativeIndividualDetailsAddress) {

		return _creativeIndividualDetailsAddressLocalService.
			updateCreativeIndividualDetailsAddress(
				creativeIndividualDetailsAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeIndividualDetailsAddressLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeIndividualDetailsAddressLocalService getWrappedService() {
		return _creativeIndividualDetailsAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualDetailsAddressLocalService
			creativeIndividualDetailsAddressLocalService) {

		_creativeIndividualDetailsAddressLocalService =
			creativeIndividualDetailsAddressLocalService;
	}

	private CreativeIndividualDetailsAddressLocalService
		_creativeIndividualDetailsAddressLocalService;

}