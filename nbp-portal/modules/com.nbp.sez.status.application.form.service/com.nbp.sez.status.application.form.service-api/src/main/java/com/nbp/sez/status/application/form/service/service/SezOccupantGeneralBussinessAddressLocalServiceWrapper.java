/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantGeneralBussinessAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddressLocalService
 * @generated
 */
public class SezOccupantGeneralBussinessAddressLocalServiceWrapper
	implements ServiceWrapper<SezOccupantGeneralBussinessAddressLocalService>,
			   SezOccupantGeneralBussinessAddressLocalService {

	public SezOccupantGeneralBussinessAddressLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantGeneralBussinessAddressLocalServiceWrapper(
		SezOccupantGeneralBussinessAddressLocalService
			sezOccupantGeneralBussinessAddressLocalService) {

		_sezOccupantGeneralBussinessAddressLocalService =
			sezOccupantGeneralBussinessAddressLocalService;
	}

	/**
	 * Adds the sez occupant general bussiness address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
			addSezOccupantGeneralBussinessAddress(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			addSezOccupantGeneralBussinessAddress(
				sezOccupantGeneralBussinessAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant general bussiness address with the primary key. Does not add the sez occupant general bussiness address to the database.
	 *
	 * @param sezOccGenBussAddressId the primary key for the new sez occupant general bussiness address
	 * @return the new sez occupant general bussiness address
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
			createSezOccupantGeneralBussinessAddress(
				long sezOccGenBussAddressId) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			createSezOccupantGeneralBussinessAddress(sezOccGenBussAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 * @throws PortalException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
				deleteSezOccupantGeneralBussinessAddress(
					long sezOccGenBussAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			deleteSezOccupantGeneralBussinessAddress(sezOccGenBussAddressId);
	}

	/**
	 * Deletes the sez occupant general bussiness address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
			deleteSezOccupantGeneralBussinessAddress(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			deleteSezOccupantGeneralBussinessAddress(
				sezOccupantGeneralBussinessAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantGeneralBussinessAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantGeneralBussinessAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantGeneralBussinessAddressLocalService.dynamicQuery();
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

		return _sezOccupantGeneralBussinessAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessAddressModelImpl</code>.
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

		return _sezOccupantGeneralBussinessAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessAddressModelImpl</code>.
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

		return _sezOccupantGeneralBussinessAddressLocalService.dynamicQuery(
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

		return _sezOccupantGeneralBussinessAddressLocalService.
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

		return _sezOccupantGeneralBussinessAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
			fetchSezOccupantGeneralBussinessAddress(
				long sezOccGenBussAddressId) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			fetchSezOccupantGeneralBussinessAddress(sezOccGenBussAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantGeneralBussinessAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address
	 * @throws PortalException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
				getSezOccupantGeneralBussinessAddress(
					long sezOccGenBussAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezOccupantGeneralBussinessAddress(sezOccGenBussAddressId);
	}

	/**
	 * Returns a range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @return the range of sez occupant general bussiness addresses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantGeneralBussinessAddress>
				getSezOccupantGeneralBussinessAddresses(int start, int end) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezOccupantGeneralBussinessAddresses(start, end);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses.
	 *
	 * @return the number of sez occupant general bussiness addresses
	 */
	@Override
	public int getSezOccupantGeneralBussinessAddressesCount() {
		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezOccupantGeneralBussinessAddressesCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress getSezStatusBy_AT_GBI(
				long generalBussinessId, String addressType)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantGeneralBussinessAddressException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezStatusBy_AT_GBI(generalBussinessId, addressType);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress getSezStatusBy_AT_SAI(
				long sezApplicationId, String addressType)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantGeneralBussinessAddressException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezStatusBy_AT_SAI(sezApplicationId, addressType);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress getSezStatusBy_Id(
				long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantGeneralBussinessAddressException {

		return _sezOccupantGeneralBussinessAddressLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant general bussiness address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessAddress
			updateSezOccupantGeneralBussinessAddress(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress) {

		return _sezOccupantGeneralBussinessAddressLocalService.
			updateSezOccupantGeneralBussinessAddress(
				sezOccupantGeneralBussinessAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantGeneralBussinessAddressLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantGeneralBussinessAddressLocalService getWrappedService() {
		return _sezOccupantGeneralBussinessAddressLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantGeneralBussinessAddressLocalService
			sezOccupantGeneralBussinessAddressLocalService) {

		_sezOccupantGeneralBussinessAddressLocalService =
			sezOccupantGeneralBussinessAddressLocalService;
	}

	private SezOccupantGeneralBussinessAddressLocalService
		_sezOccupantGeneralBussinessAddressLocalService;

}