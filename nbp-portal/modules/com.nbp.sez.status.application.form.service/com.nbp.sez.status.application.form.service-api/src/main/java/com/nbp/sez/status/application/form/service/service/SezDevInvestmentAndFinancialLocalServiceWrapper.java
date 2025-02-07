/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevInvestmentAndFinancialLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancialLocalService
 * @generated
 */
public class SezDevInvestmentAndFinancialLocalServiceWrapper
	implements ServiceWrapper<SezDevInvestmentAndFinancialLocalService>,
			   SezDevInvestmentAndFinancialLocalService {

	public SezDevInvestmentAndFinancialLocalServiceWrapper() {
		this(null);
	}

	public SezDevInvestmentAndFinancialLocalServiceWrapper(
		SezDevInvestmentAndFinancialLocalService
			sezDevInvestmentAndFinancialLocalService) {

		_sezDevInvestmentAndFinancialLocalService =
			sezDevInvestmentAndFinancialLocalService;
	}

	/**
	 * Adds the sez dev investment and financial to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevInvestmentAndFinancialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 * @return the sez dev investment and financial that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial addSezDevInvestmentAndFinancial(
			com.nbp.sez.status.application.form.service.model.
				SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return _sezDevInvestmentAndFinancialLocalService.
			addSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancial);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevInvestmentAndFinancialLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev investment and financial with the primary key. Does not add the sez dev investment and financial to the database.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key for the new sez dev investment and financial
	 * @return the new sez dev investment and financial
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial createSezDevInvestmentAndFinancial(
			long sezDevInvestmentAndFinancialId) {

		return _sezDevInvestmentAndFinancialLocalService.
			createSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancialId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevInvestmentAndFinancialLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev investment and financial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevInvestmentAndFinancialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 * @throws PortalException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial deleteSezDevInvestmentAndFinancial(
				long sezDevInvestmentAndFinancialId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevInvestmentAndFinancialLocalService.
			deleteSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancialId);
	}

	/**
	 * Deletes the sez dev investment and financial from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevInvestmentAndFinancialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial deleteSezDevInvestmentAndFinancial(
			com.nbp.sez.status.application.form.service.model.
				SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return _sezDevInvestmentAndFinancialLocalService.
			deleteSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancial);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevInvestmentAndFinancialLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevInvestmentAndFinancialLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevInvestmentAndFinancialLocalService.dynamicQuery();
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

		return _sezDevInvestmentAndFinancialLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevInvestmentAndFinancialModelImpl</code>.
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

		return _sezDevInvestmentAndFinancialLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevInvestmentAndFinancialModelImpl</code>.
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

		return _sezDevInvestmentAndFinancialLocalService.dynamicQuery(
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

		return _sezDevInvestmentAndFinancialLocalService.dynamicQueryCount(
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

		return _sezDevInvestmentAndFinancialLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial fetchSezDevInvestmentAndFinancial(
			long sezDevInvestmentAndFinancialId) {

		return _sezDevInvestmentAndFinancialLocalService.
			fetchSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancialId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevInvestmentAndFinancialLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevInvestmentAndFinancialLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevInvestmentAndFinancialLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevInvestmentAndFinancialLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezDevInvestmentAndFinancialException {

		return _sezDevInvestmentAndFinancialLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev investment and financial with the primary key.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial
	 * @throws PortalException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial getSezDevInvestmentAndFinancial(
				long sezDevInvestmentAndFinancialId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevInvestmentAndFinancialLocalService.
			getSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancialId);
	}

	/**
	 * Returns a range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @return the range of sez dev investment and financials
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevInvestmentAndFinancial> getSezDevInvestmentAndFinancials(
				int start, int end) {

		return _sezDevInvestmentAndFinancialLocalService.
			getSezDevInvestmentAndFinancials(start, end);
	}

	/**
	 * Returns the number of sez dev investment and financials.
	 *
	 * @return the number of sez dev investment and financials
	 */
	@Override
	public int getSezDevInvestmentAndFinancialsCount() {
		return _sezDevInvestmentAndFinancialLocalService.
			getSezDevInvestmentAndFinancialsCount();
	}

	/**
	 * Updates the sez dev investment and financial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevInvestmentAndFinancialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 * @return the sez dev investment and financial that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevInvestmentAndFinancial updateSezDevInvestmentAndFinancial(
			com.nbp.sez.status.application.form.service.model.
				SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return _sezDevInvestmentAndFinancialLocalService.
			updateSezDevInvestmentAndFinancial(sezDevInvestmentAndFinancial);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevInvestmentAndFinancialLocalService.getBasePersistence();
	}

	@Override
	public SezDevInvestmentAndFinancialLocalService getWrappedService() {
		return _sezDevInvestmentAndFinancialLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevInvestmentAndFinancialLocalService
			sezDevInvestmentAndFinancialLocalService) {

		_sezDevInvestmentAndFinancialLocalService =
			sezDevInvestmentAndFinancialLocalService;
	}

	private SezDevInvestmentAndFinancialLocalService
		_sezDevInvestmentAndFinancialLocalService;

}