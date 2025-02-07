/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiApplicationPermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermitLocalService
 * @generated
 */
public class OsiApplicationPermitLocalServiceWrapper
	implements OsiApplicationPermitLocalService,
			   ServiceWrapper<OsiApplicationPermitLocalService> {

	public OsiApplicationPermitLocalServiceWrapper() {
		this(null);
	}

	public OsiApplicationPermitLocalServiceWrapper(
		OsiApplicationPermitLocalService osiApplicationPermitLocalService) {

		_osiApplicationPermitLocalService = osiApplicationPermitLocalService;
	}

	/**
	 * Adds the osi application permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was added
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		addOsiApplicationPermit(
			com.nbp.osi.stages.services.model.OsiApplicationPermit
				osiApplicationPermit) {

		return _osiApplicationPermitLocalService.addOsiApplicationPermit(
			osiApplicationPermit);
	}

	/**
	 * Creates a new osi application permit with the primary key. Does not add the osi application permit to the database.
	 *
	 * @param osiApplicationPermitId the primary key for the new osi application permit
	 * @return the new osi application permit
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		createOsiApplicationPermit(long osiApplicationPermitId) {

		return _osiApplicationPermitLocalService.createOsiApplicationPermit(
			osiApplicationPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationPermitLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws PortalException if a osi application permit with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
			deleteOsiApplicationPermit(long osiApplicationPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationPermitLocalService.deleteOsiApplicationPermit(
			osiApplicationPermitId);
	}

	/**
	 * Deletes the osi application permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was removed
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		deleteOsiApplicationPermit(
			com.nbp.osi.stages.services.model.OsiApplicationPermit
				osiApplicationPermit) {

		return _osiApplicationPermitLocalService.deleteOsiApplicationPermit(
			osiApplicationPermit);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationPermitLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiApplicationPermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiApplicationPermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiApplicationPermitLocalService.dynamicQuery();
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

		return _osiApplicationPermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
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

		return _osiApplicationPermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
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

		return _osiApplicationPermitLocalService.dynamicQuery(
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

		return _osiApplicationPermitLocalService.dynamicQueryCount(
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

		return _osiApplicationPermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		fetchOsiApplicationPermit(long osiApplicationPermitId) {

		return _osiApplicationPermitLocalService.fetchOsiApplicationPermit(
			osiApplicationPermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiApplicationPermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiApplicationPermitLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationPermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi application permit with the primary key.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws PortalException if a osi application permit with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
			getOsiApplicationPermit(long osiApplicationPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationPermitLocalService.getOsiApplicationPermit(
			osiApplicationPermitId);
	}

	/**
	 * Returns a range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @return the range of osi application permits
	 */
	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationPermit>
			getOsiApplicationPermits(int start, int end) {

		return _osiApplicationPermitLocalService.getOsiApplicationPermits(
			start, end);
	}

	/**
	 * Returns the number of osi application permits.
	 *
	 * @return the number of osi application permits
	 */
	@Override
	public int getOsiApplicationPermitsCount() {
		return _osiApplicationPermitLocalService.
			getOsiApplicationPermitsCount();
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
			getOsiByCaseId(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return _osiApplicationPermitLocalService.getOsiByCaseId(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationPermitLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi application permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was updated
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		updateOsiApplicationPermit(
			com.nbp.osi.stages.services.model.OsiApplicationPermit
				osiApplicationPermit) {

		return _osiApplicationPermitLocalService.updateOsiApplicationPermit(
			osiApplicationPermit);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationPermit
		updateOsiApplicationPermit(
			String caseId, java.util.Date dateOfDecision, String decision,
			java.util.Date issueDate, java.util.Date expiryDate,
			String permitNumber, String fileEntryId) {

		return _osiApplicationPermitLocalService.updateOsiApplicationPermit(
			caseId, dateOfDecision, decision, issueDate, expiryDate,
			permitNumber, fileEntryId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiApplicationPermitLocalService.getBasePersistence();
	}

	@Override
	public OsiApplicationPermitLocalService getWrappedService() {
		return _osiApplicationPermitLocalService;
	}

	@Override
	public void setWrappedService(
		OsiApplicationPermitLocalService osiApplicationPermitLocalService) {

		_osiApplicationPermitLocalService = osiApplicationPermitLocalService;
	}

	private OsiApplicationPermitLocalService _osiApplicationPermitLocalService;

}