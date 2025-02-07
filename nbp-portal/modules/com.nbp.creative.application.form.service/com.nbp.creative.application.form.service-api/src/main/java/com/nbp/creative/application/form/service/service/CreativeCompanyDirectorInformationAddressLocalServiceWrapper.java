/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyDirectorInformationAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddressLocalService
 * @generated
 */
public class CreativeCompanyDirectorInformationAddressLocalServiceWrapper
	implements CreativeCompanyDirectorInformationAddressLocalService,
			   ServiceWrapper
				   <CreativeCompanyDirectorInformationAddressLocalService> {

	public CreativeCompanyDirectorInformationAddressLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDirectorInformationAddressLocalServiceWrapper(
		CreativeCompanyDirectorInformationAddressLocalService
			creativeCompanyDirectorInformationAddressLocalService) {

		_creativeCompanyDirectorInformationAddressLocalService =
			creativeCompanyDirectorInformationAddressLocalService;
	}

	/**
	 * Adds the creative company director information address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
			addCreativeCompanyDirectorInformationAddress(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformationAddress
						creativeCompanyDirectorInformationAddress) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			addCreativeCompanyDirectorInformationAddress(
				creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Creates a new creative company director information address with the primary key. Does not add the creative company director information address to the database.
	 *
	 * @param creativeComDirectorAddressId the primary key for the new creative company director information address
	 * @return the new creative company director information address
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
			createCreativeCompanyDirectorInformationAddress(
				long creativeComDirectorAddressId) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			createCreativeCompanyDirectorInformationAddress(
				creativeComDirectorAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative company director information address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
			deleteCreativeCompanyDirectorInformationAddress(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformationAddress
						creativeCompanyDirectorInformationAddress) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			deleteCreativeCompanyDirectorInformationAddress(
				creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Deletes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws PortalException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
				deleteCreativeCompanyDirectorInformationAddress(
					long creativeComDirectorAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			deleteCreativeCompanyDirectorInformationAddress(
				creativeComDirectorAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyDirectorInformationAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQuery();
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

		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
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

		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
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

		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _creativeCompanyDirectorInformationAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
			fetchCreativeCompanyDirectorInformationAddress(
				long creativeComDirectorAddressId) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			fetchCreativeCompanyDirectorInformationAddress(
				creativeComDirectorAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress getCreativeBYId(
				long creativeApplicationId)
			throws com.nbp.creative.application.form.service.exception.
				NoSuchCreativeCompanyDirectorInformationAddressException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getCreativeBYId(creativeApplicationId);
	}

	/**
	 * Returns the creative company director information address with the primary key.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws PortalException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
				getCreativeCompanyDirectorInformationAddress(
					long creativeComDirectorAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getCreativeCompanyDirectorInformationAddress(
				creativeComDirectorAddressId);
	}

	/**
	 * Returns a range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @return the range of creative company director information addresses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyDirectorInformationAddress>
				getCreativeCompanyDirectorInformationAddresses(
					int start, int end) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getCreativeCompanyDirectorInformationAddresses(start, end);
	}

	/**
	 * Returns the number of creative company director information addresses.
	 *
	 * @return the number of creative company director information addresses
	 */
	@Override
	public int getCreativeCompanyDirectorInformationAddressesCount() {
		return _creativeCompanyDirectorInformationAddressLocalService.
			getCreativeCompanyDirectorInformationAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDirectorInformationAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative company director information address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformationAddress
			updateCreativeCompanyDirectorInformationAddress(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformationAddress
						creativeCompanyDirectorInformationAddress) {

		return _creativeCompanyDirectorInformationAddressLocalService.
			updateCreativeCompanyDirectorInformationAddress(
				creativeCompanyDirectorInformationAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyDirectorInformationAddressLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeCompanyDirectorInformationAddressLocalService
		getWrappedService() {

		return _creativeCompanyDirectorInformationAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDirectorInformationAddressLocalService
			creativeCompanyDirectorInformationAddressLocalService) {

		_creativeCompanyDirectorInformationAddressLocalService =
			creativeCompanyDirectorInformationAddressLocalService;
	}

	private CreativeCompanyDirectorInformationAddressLocalService
		_creativeCompanyDirectorInformationAddressLocalService;

}