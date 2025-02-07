/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HSRAApplicationDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationDueDiligenceLocalService
 * @generated
 */
public class HSRAApplicationDueDiligenceLocalServiceWrapper
	implements HSRAApplicationDueDiligenceLocalService,
			   ServiceWrapper<HSRAApplicationDueDiligenceLocalService> {

	public HSRAApplicationDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public HSRAApplicationDueDiligenceLocalServiceWrapper(
		HSRAApplicationDueDiligenceLocalService
			hsraApplicationDueDiligenceLocalService) {

		_hsraApplicationDueDiligenceLocalService =
			hsraApplicationDueDiligenceLocalService;
	}

	/**
	 * Adds the hsra application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 * @return the hsra application due diligence that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		addHSRAApplicationDueDiligence(
			com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
				hsraApplicationDueDiligence) {

		return _hsraApplicationDueDiligenceLocalService.
			addHSRAApplicationDueDiligence(hsraApplicationDueDiligence);
	}

	/**
	 * Creates a new hsra application due diligence with the primary key. Does not add the hsra application due diligence to the database.
	 *
	 * @param hsraAppDDId the primary key for the new hsra application due diligence
	 * @return the new hsra application due diligence
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		createHSRAApplicationDueDiligence(long hsraAppDDId) {

		return _hsraApplicationDueDiligenceLocalService.
			createHSRAApplicationDueDiligence(hsraAppDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		deleteHSRAApplicationDueDiligence(
			com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
				hsraApplicationDueDiligence) {

		return _hsraApplicationDueDiligenceLocalService.
			deleteHSRAApplicationDueDiligence(hsraApplicationDueDiligence);
	}

	/**
	 * Deletes the hsra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 * @throws PortalException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
			deleteHSRAApplicationDueDiligence(long hsraAppDDId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDueDiligenceLocalService.
			deleteHSRAApplicationDueDiligence(hsraAppDDId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationDueDiligenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationDueDiligenceLocalService.dynamicQuery();
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

		return _hsraApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationDueDiligenceModelImpl</code>.
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

		return _hsraApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationDueDiligenceModelImpl</code>.
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

		return _hsraApplicationDueDiligenceLocalService.dynamicQuery(
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

		return _hsraApplicationDueDiligenceLocalService.dynamicQueryCount(
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

		return _hsraApplicationDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		fetchHSRAApplicationDueDiligence(long hsraAppDDId) {

		return _hsraApplicationDueDiligenceLocalService.
			fetchHSRAApplicationDueDiligence(hsraAppDDId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationDueDiligenceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the hsra application due diligence with the primary key.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence
	 * @throws PortalException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
			getHSRAApplicationDueDiligence(long hsraAppDDId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDueDiligenceLocalService.
			getHSRAApplicationDueDiligence(hsraAppDDId);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		getHSRAApplicationDueDiligenceByCI(String caseId) {

		return _hsraApplicationDueDiligenceLocalService.
			getHSRAApplicationDueDiligenceByCI(caseId);
	}

	/**
	 * Returns a range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of hsra application due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence>
			getHSRAApplicationDueDiligences(int start, int end) {

		return _hsraApplicationDueDiligenceLocalService.
			getHSRAApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of hsra application due diligences.
	 *
	 * @return the number of hsra application due diligences
	 */
	@Override
	public int getHSRAApplicationDueDiligencesCount() {
		return _hsraApplicationDueDiligenceLocalService.
			getHSRAApplicationDueDiligencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationDueDiligenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 * @return the hsra application due diligence that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		updateHSRAApplicationDueDiligence(
			com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
				hsraApplicationDueDiligence) {

		return _hsraApplicationDueDiligenceLocalService.
			updateHSRAApplicationDueDiligence(hsraApplicationDueDiligence);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		updateHSRAApplicationDueDiligence(
			String caseId, String agencyName, String status,
			String agencyDecision) {

		return _hsraApplicationDueDiligenceLocalService.
			updateHSRAApplicationDueDiligence(
				caseId, agencyName, status, agencyDecision);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence
		updateHSRAApplicationDueDiligence(
			String caseId, String agencyName, String status,
			String agencyDecision, String feedback) {

		return _hsraApplicationDueDiligenceLocalService.
			updateHSRAApplicationDueDiligence(
				caseId, agencyName, status, agencyDecision, feedback);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public HSRAApplicationDueDiligenceLocalService getWrappedService() {
		return _hsraApplicationDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		HSRAApplicationDueDiligenceLocalService
			hsraApplicationDueDiligenceLocalService) {

		_hsraApplicationDueDiligenceLocalService =
			hsraApplicationDueDiligenceLocalService;
	}

	private HSRAApplicationDueDiligenceLocalService
		_hsraApplicationDueDiligenceLocalService;

}