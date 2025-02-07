/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FinancialPositionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPositionLocalService
 * @generated
 */
public class FinancialPositionLocalServiceWrapper
	implements FinancialPositionLocalService,
			   ServiceWrapper<FinancialPositionLocalService> {

	public FinancialPositionLocalServiceWrapper() {
		this(null);
	}

	public FinancialPositionLocalServiceWrapper(
		FinancialPositionLocalService financialPositionLocalService) {

		_financialPositionLocalService = financialPositionLocalService;
	}

	/**
	 * Adds the financial position to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param financialPosition the financial position
	 * @return the financial position that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
			addFinancialPosition(
				com.nbp.osi.insolvency.application.form.services.model.
					FinancialPosition financialPosition) {

		return _financialPositionLocalService.addFinancialPosition(
			financialPosition);
	}

	/**
	 * Creates a new financial position with the primary key. Does not add the financial position to the database.
	 *
	 * @param financialPositionId the primary key for the new financial position
	 * @return the new financial position
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
			createFinancialPosition(long financialPositionId) {

		return _financialPositionLocalService.createFinancialPosition(
			financialPositionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _financialPositionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the financial position from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param financialPosition the financial position
	 * @return the financial position that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
			deleteFinancialPosition(
				com.nbp.osi.insolvency.application.form.services.model.
					FinancialPosition financialPosition) {

		return _financialPositionLocalService.deleteFinancialPosition(
			financialPosition);
	}

	/**
	 * Deletes the financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position that was removed
	 * @throws PortalException if a financial position with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
				deleteFinancialPosition(long financialPositionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _financialPositionLocalService.deleteFinancialPosition(
			financialPositionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _financialPositionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _financialPositionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _financialPositionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _financialPositionLocalService.dynamicQuery();
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

		return _financialPositionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.FinancialPositionModelImpl</code>.
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

		return _financialPositionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.FinancialPositionModelImpl</code>.
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

		return _financialPositionLocalService.dynamicQuery(
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

		return _financialPositionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _financialPositionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
			fetchFinancialPosition(long financialPositionId) {

		return _financialPositionLocalService.fetchFinancialPosition(
			financialPositionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _financialPositionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the financial position with the primary key.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position
	 * @throws PortalException if a financial position with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
				getFinancialPosition(long financialPositionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _financialPositionLocalService.getFinancialPosition(
			financialPositionId);
	}

	/**
	 * Returns a range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @return the range of financial positions
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			FinancialPosition> getFinancialPositions(int start, int end) {

		return _financialPositionLocalService.getFinancialPositions(start, end);
	}

	/**
	 * Returns the number of financial positions.
	 *
	 * @return the number of financial positions
	 */
	@Override
	public int getFinancialPositionsCount() {
		return _financialPositionLocalService.getFinancialPositionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _financialPositionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _financialPositionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
				getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchFinancialPositionException {

		return _financialPositionLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _financialPositionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the financial position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param financialPosition the financial position
	 * @return the financial position that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.FinancialPosition
			updateFinancialPosition(
				com.nbp.osi.insolvency.application.form.services.model.
					FinancialPosition financialPosition) {

		return _financialPositionLocalService.updateFinancialPosition(
			financialPosition);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _financialPositionLocalService.getBasePersistence();
	}

	@Override
	public FinancialPositionLocalService getWrappedService() {
		return _financialPositionLocalService;
	}

	@Override
	public void setWrappedService(
		FinancialPositionLocalService financialPositionLocalService) {

		_financialPositionLocalService = financialPositionLocalService;
	}

	private FinancialPositionLocalService _financialPositionLocalService;

}