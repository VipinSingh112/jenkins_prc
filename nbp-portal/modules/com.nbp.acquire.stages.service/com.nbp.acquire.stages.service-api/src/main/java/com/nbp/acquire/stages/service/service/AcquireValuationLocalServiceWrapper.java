/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireValuationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationLocalService
 * @generated
 */
public class AcquireValuationLocalServiceWrapper
	implements AcquireValuationLocalService,
			   ServiceWrapper<AcquireValuationLocalService> {

	public AcquireValuationLocalServiceWrapper() {
		this(null);
	}

	public AcquireValuationLocalServiceWrapper(
		AcquireValuationLocalService acquireValuationLocalService) {

		_acquireValuationLocalService = acquireValuationLocalService;
	}

	/**
	 * Adds the acquire valuation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		addAcquireValuation(
			com.nbp.acquire.stages.service.model.AcquireValuation
				acquireValuation) {

		return _acquireValuationLocalService.addAcquireValuation(
			acquireValuation);
	}

	/**
	 * Creates a new acquire valuation with the primary key. Does not add the acquire valuation to the database.
	 *
	 * @param acquireValuationId the primary key for the new acquire valuation
	 * @return the new acquire valuation
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		createAcquireValuation(long acquireValuationId) {

		return _acquireValuationLocalService.createAcquireValuation(
			acquireValuationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireValuationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire valuation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		deleteAcquireValuation(
			com.nbp.acquire.stages.service.model.AcquireValuation
				acquireValuation) {

		return _acquireValuationLocalService.deleteAcquireValuation(
			acquireValuation);
	}

	/**
	 * Deletes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws PortalException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
			deleteAcquireValuation(long acquireValuationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireValuationLocalService.deleteAcquireValuation(
			acquireValuationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireValuationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireValuationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireValuationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireValuationLocalService.dynamicQuery();
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

		return _acquireValuationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
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

		return _acquireValuationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
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

		return _acquireValuationLocalService.dynamicQuery(
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

		return _acquireValuationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireValuationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		fetchAcquireValuation(long acquireValuationId) {

		return _acquireValuationLocalService.fetchAcquireValuation(
			acquireValuationId);
	}

	/**
	 * Returns the acquire valuation with the primary key.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws PortalException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
			getAcquireValuation(long acquireValuationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireValuationLocalService.getAcquireValuation(
			acquireValuationId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
			getAcquireValuationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return _acquireValuationLocalService.getAcquireValuationBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @return the range of acquire valuations
	 */
	@Override
	public java.util.List<com.nbp.acquire.stages.service.model.AcquireValuation>
		getAcquireValuations(int start, int end) {

		return _acquireValuationLocalService.getAcquireValuations(start, end);
	}

	/**
	 * Returns the number of acquire valuations.
	 *
	 * @return the number of acquire valuations
	 */
	@Override
	public int getAcquireValuationsCount() {
		return _acquireValuationLocalService.getAcquireValuationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireValuationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireValuationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireValuationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireValuationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		updateAcquireApplicationValuation(
			String caseId, String valuationStatus, String valuationFolio,
			String valuationVolume, String valuationNumber) {

		return _acquireValuationLocalService.updateAcquireApplicationValuation(
			caseId, valuationStatus, valuationFolio, valuationVolume,
			valuationNumber);
	}

	/**
	 * Updates the acquire valuation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireValuation
		updateAcquireValuation(
			com.nbp.acquire.stages.service.model.AcquireValuation
				acquireValuation) {

		return _acquireValuationLocalService.updateAcquireValuation(
			acquireValuation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireValuationLocalService.getBasePersistence();
	}

	@Override
	public AcquireValuationLocalService getWrappedService() {
		return _acquireValuationLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireValuationLocalService acquireValuationLocalService) {

		_acquireValuationLocalService = acquireValuationLocalService;
	}

	private AcquireValuationLocalService _acquireValuationLocalService;

}