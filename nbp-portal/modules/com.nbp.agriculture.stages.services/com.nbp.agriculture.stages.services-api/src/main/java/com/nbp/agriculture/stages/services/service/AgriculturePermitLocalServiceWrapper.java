/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgriculturePermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermitLocalService
 * @generated
 */
public class AgriculturePermitLocalServiceWrapper
	implements AgriculturePermitLocalService,
			   ServiceWrapper<AgriculturePermitLocalService> {

	public AgriculturePermitLocalServiceWrapper() {
		this(null);
	}

	public AgriculturePermitLocalServiceWrapper(
		AgriculturePermitLocalService agriculturePermitLocalService) {

		_agriculturePermitLocalService = agriculturePermitLocalService;
	}

	/**
	 * Adds the agriculture permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePermit the agriculture permit
	 * @return the agriculture permit that was added
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		addAgriculturePermit(
			com.nbp.agriculture.stages.services.model.AgriculturePermit
				agriculturePermit) {

		return _agriculturePermitLocalService.addAgriculturePermit(
			agriculturePermit);
	}

	/**
	 * Creates a new agriculture permit with the primary key. Does not add the agriculture permit to the database.
	 *
	 * @param agriculturePermitId the primary key for the new agriculture permit
	 * @return the new agriculture permit
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		createAgriculturePermit(long agriculturePermitId) {

		return _agriculturePermitLocalService.createAgriculturePermit(
			agriculturePermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePermitLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePermit the agriculture permit
	 * @return the agriculture permit that was removed
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		deleteAgriculturePermit(
			com.nbp.agriculture.stages.services.model.AgriculturePermit
				agriculturePermit) {

		return _agriculturePermitLocalService.deleteAgriculturePermit(
			agriculturePermit);
	}

	/**
	 * Deletes the agriculture permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit that was removed
	 * @throws PortalException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
			deleteAgriculturePermit(long agriculturePermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePermitLocalService.deleteAgriculturePermit(
			agriculturePermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePermitLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agriculturePermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agriculturePermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agriculturePermitLocalService.dynamicQuery();
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

		return _agriculturePermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriculturePermitModelImpl</code>.
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

		return _agriculturePermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriculturePermitModelImpl</code>.
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

		return _agriculturePermitLocalService.dynamicQuery(
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

		return _agriculturePermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agriculturePermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		fetchAgriculturePermit(long agriculturePermitId) {

		return _agriculturePermitLocalService.fetchAgriculturePermit(
			agriculturePermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agriculturePermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
			getAgricultureBy_CI(String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return _agriculturePermitLocalService.getAgricultureBy_CI(caseId);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
			getAgricultureBy_PN(String PermitNumber)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriculturePermitException {

		return _agriculturePermitLocalService.getAgricultureBy_PN(PermitNumber);
	}

	/**
	 * Returns the agriculture permit with the primary key.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit
	 * @throws PortalException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
			getAgriculturePermit(long agriculturePermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePermitLocalService.getAgriculturePermit(
			agriculturePermitId);
	}

	/**
	 * Returns a range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of agriculture permits
	 */
	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgriculturePermit>
			getAgriculturePermits(int start, int end) {

		return _agriculturePermitLocalService.getAgriculturePermits(start, end);
	}

	/**
	 * Returns the number of agriculture permits.
	 *
	 * @return the number of agriculture permits
	 */
	@Override
	public int getAgriculturePermitsCount() {
		return _agriculturePermitLocalService.getAgriculturePermitsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agriculturePermitLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriculturePermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePermitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agriculture permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePermit the agriculture permit
	 * @return the agriculture permit that was updated
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		updateAgriculturePermit(
			com.nbp.agriculture.stages.services.model.AgriculturePermit
				agriculturePermit) {

		return _agriculturePermitLocalService.updateAgriculturePermit(
			agriculturePermit);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgriculturePermit
		updateAgriculturePermit(
			String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
			java.util.Date dateofExpiration, String durationofPermit) {

		return _agriculturePermitLocalService.updateAgriculturePermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			durationofPermit);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agriculturePermitLocalService.getBasePersistence();
	}

	@Override
	public AgriculturePermitLocalService getWrappedService() {
		return _agriculturePermitLocalService;
	}

	@Override
	public void setWrappedService(
		AgriculturePermitLocalService agriculturePermitLocalService) {

		_agriculturePermitLocalService = agriculturePermitLocalService;
	}

	private AgriculturePermitLocalService _agriculturePermitLocalService;

}