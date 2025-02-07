/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantInvestAndFinanceInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfoLocalService
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupantInvestAndFinanceInfoLocalService>,
			   SezOccupantInvestAndFinanceInfoLocalService {

	public SezOccupantInvestAndFinanceInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantInvestAndFinanceInfoLocalServiceWrapper(
		SezOccupantInvestAndFinanceInfoLocalService
			sezOccupantInvestAndFinanceInfoLocalService) {

		_sezOccupantInvestAndFinanceInfoLocalService =
			sezOccupantInvestAndFinanceInfoLocalService;
	}

	/**
	 * Adds the sez occupant invest and finance info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantInvestAndFinanceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantInvestAndFinanceInfo the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo addSezOccupantInvestAndFinanceInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantInvestAndFinanceInfo
					sezOccupantInvestAndFinanceInfo) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			addSezOccupantInvestAndFinanceInfo(sezOccupantInvestAndFinanceInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant invest and finance info with the primary key. Does not add the sez occupant invest and finance info to the database.
	 *
	 * @param sezOccInvestFinancId the primary key for the new sez occupant invest and finance info
	 * @return the new sez occupant invest and finance info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo createSezOccupantInvestAndFinanceInfo(
			long sezOccInvestFinancId) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			createSezOccupantInvestAndFinanceInfo(sezOccInvestFinancId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant invest and finance info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantInvestAndFinanceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was removed
	 * @throws PortalException if a sez occupant invest and finance info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo deleteSezOccupantInvestAndFinanceInfo(
				long sezOccInvestFinancId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			deleteSezOccupantInvestAndFinanceInfo(sezOccInvestFinancId);
	}

	/**
	 * Deletes the sez occupant invest and finance info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantInvestAndFinanceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantInvestAndFinanceInfo the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo deleteSezOccupantInvestAndFinanceInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantInvestAndFinanceInfo
					sezOccupantInvestAndFinanceInfo) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			deleteSezOccupantInvestAndFinanceInfo(
				sezOccupantInvestAndFinanceInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantInvestAndFinanceInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantInvestAndFinanceInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQuery();
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

		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantInvestAndFinanceInfoModelImpl</code>.
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

		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantInvestAndFinanceInfoModelImpl</code>.
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

		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQuery(
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

		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQueryCount(
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

		return _sezOccupantInvestAndFinanceInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo fetchSezOccupantInvestAndFinanceInfo(
			long sezOccInvestFinancId) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			fetchSezOccupantInvestAndFinanceInfo(sezOccInvestFinancId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantInvestAndFinanceInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantInvestAndFinanceInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant invest and finance info with the primary key.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info
	 * @throws PortalException if a sez occupant invest and finance info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo getSezOccupantInvestAndFinanceInfo(
				long sezOccInvestFinancId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			getSezOccupantInvestAndFinanceInfo(sezOccInvestFinancId);
	}

	/**
	 * Returns a range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @return the range of sez occupant invest and finance infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantInvestAndFinanceInfo>
				getSezOccupantInvestAndFinanceInfos(int start, int end) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			getSezOccupantInvestAndFinanceInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant invest and finance infos.
	 *
	 * @return the number of sez occupant invest and finance infos
	 */
	@Override
	public int getSezOccupantInvestAndFinanceInfosCount() {
		return _sezOccupantInvestAndFinanceInfoLocalService.
			getSezOccupantInvestAndFinanceInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo getSezStatusBy_Id(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantInvestAndFinanceInfoException {

		return _sezOccupantInvestAndFinanceInfoLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant invest and finance info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantInvestAndFinanceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantInvestAndFinanceInfo the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantInvestAndFinanceInfo updateSezOccupantInvestAndFinanceInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantInvestAndFinanceInfo
					sezOccupantInvestAndFinanceInfo) {

		return _sezOccupantInvestAndFinanceInfoLocalService.
			updateSezOccupantInvestAndFinanceInfo(
				sezOccupantInvestAndFinanceInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantInvestAndFinanceInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantInvestAndFinanceInfoLocalService getWrappedService() {
		return _sezOccupantInvestAndFinanceInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantInvestAndFinanceInfoLocalService
			sezOccupantInvestAndFinanceInfoLocalService) {

		_sezOccupantInvestAndFinanceInfoLocalService =
			sezOccupantInvestAndFinanceInfoLocalService;
	}

	private SezOccupantInvestAndFinanceInfoLocalService
		_sezOccupantInvestAndFinanceInfoLocalService;

}