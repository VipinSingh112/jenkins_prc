/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantGeneralBussinessInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfoLocalService
 * @generated
 */
public class SezOccupantGeneralBussinessInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupantGeneralBussinessInfoLocalService>,
			   SezOccupantGeneralBussinessInfoLocalService {

	public SezOccupantGeneralBussinessInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantGeneralBussinessInfoLocalServiceWrapper(
		SezOccupantGeneralBussinessInfoLocalService
			sezOccupantGeneralBussinessInfoLocalService) {

		_sezOccupantGeneralBussinessInfoLocalService =
			sezOccupantGeneralBussinessInfoLocalService;
	}

	/**
	 * Adds the sez occupant general bussiness info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessInfo the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo addSezOccupantGeneralBussinessInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantGeneralBussinessInfo
					sezOccupantGeneralBussinessInfo) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			addSezOccupantGeneralBussinessInfo(sezOccupantGeneralBussinessInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant general bussiness info with the primary key. Does not add the sez occupant general bussiness info to the database.
	 *
	 * @param sezOccGenBussId the primary key for the new sez occupant general bussiness info
	 * @return the new sez occupant general bussiness info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo createSezOccupantGeneralBussinessInfo(
			long sezOccGenBussId) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			createSezOccupantGeneralBussinessInfo(sezOccGenBussId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant general bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was removed
	 * @throws PortalException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo deleteSezOccupantGeneralBussinessInfo(
				long sezOccGenBussId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessInfoLocalService.
			deleteSezOccupantGeneralBussinessInfo(sezOccGenBussId);
	}

	/**
	 * Deletes the sez occupant general bussiness info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessInfo the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo deleteSezOccupantGeneralBussinessInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantGeneralBussinessInfo
					sezOccupantGeneralBussinessInfo) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			deleteSezOccupantGeneralBussinessInfo(
				sezOccupantGeneralBussinessInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantGeneralBussinessInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantGeneralBussinessInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQuery();
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

		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoModelImpl</code>.
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

		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoModelImpl</code>.
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

		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQuery(
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

		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQueryCount(
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

		return _sezOccupantGeneralBussinessInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo fetchSezOccupantGeneralBussinessInfo(
			long sezOccGenBussId) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			fetchSezOccupantGeneralBussinessInfo(sezOccGenBussId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantGeneralBussinessInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantGeneralBussinessInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantGeneralBussinessInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info
	 * @throws PortalException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo getSezOccupantGeneralBussinessInfo(
				long sezOccGenBussId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantGeneralBussinessInfoLocalService.
			getSezOccupantGeneralBussinessInfo(sezOccGenBussId);
	}

	/**
	 * Returns a range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @return the range of sez occupant general bussiness infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantGeneralBussinessInfo>
				getSezOccupantGeneralBussinessInfos(int start, int end) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			getSezOccupantGeneralBussinessInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant general bussiness infos.
	 *
	 * @return the number of sez occupant general bussiness infos
	 */
	@Override
	public int getSezOccupantGeneralBussinessInfosCount() {
		return _sezOccupantGeneralBussinessInfoLocalService.
			getSezOccupantGeneralBussinessInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo getSezStatusBy_Id(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantGeneralBussinessInfoException {

		return _sezOccupantGeneralBussinessInfoLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant general bussiness info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantGeneralBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantGeneralBussinessInfo the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantGeneralBussinessInfo updateSezOccupantGeneralBussinessInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantGeneralBussinessInfo
					sezOccupantGeneralBussinessInfo) {

		return _sezOccupantGeneralBussinessInfoLocalService.
			updateSezOccupantGeneralBussinessInfo(
				sezOccupantGeneralBussinessInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantGeneralBussinessInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantGeneralBussinessInfoLocalService getWrappedService() {
		return _sezOccupantGeneralBussinessInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantGeneralBussinessInfoLocalService
			sezOccupantGeneralBussinessInfoLocalService) {

		_sezOccupantGeneralBussinessInfoLocalService =
			sezOccupantGeneralBussinessInfoLocalService;
	}

	private SezOccupantGeneralBussinessInfoLocalService
		_sezOccupantGeneralBussinessInfoLocalService;

}