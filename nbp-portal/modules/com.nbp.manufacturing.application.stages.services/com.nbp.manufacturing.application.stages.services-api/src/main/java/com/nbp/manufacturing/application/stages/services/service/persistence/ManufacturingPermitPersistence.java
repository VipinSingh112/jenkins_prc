/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingPermitException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manufacturing permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermitUtil
 * @generated
 */
@ProviderType
public interface ManufacturingPermitPersistence
	extends BasePersistence<ManufacturingPermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManufacturingPermitUtil} to access the manufacturing permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manufacturing permit where caseId = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit findBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchManufacturingPermitException;

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId);

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the manufacturing permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing permit that was removed
	 */
	public ManufacturingPermit removeBygetManufacturingPermitBY_CI(
			String caseId)
		throws NoSuchManufacturingPermitException;

	/**
	 * Returns the number of manufacturing permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing permits
	 */
	public int countBygetManufacturingPermitBY_CI(String caseId);

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit findBygetManufacturingPermitBY_PermitNumber(
			String PIRPermtNumber)
		throws NoSuchManufacturingPermitException;

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit fetchBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber);

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	public ManufacturingPermit fetchBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber, boolean useFinderCache);

	/**
	 * Removes the manufacturing permit where PIRPermtNumber = &#63; from the database.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the manufacturing permit that was removed
	 */
	public ManufacturingPermit removeBygetManufacturingPermitBY_PermitNumber(
			String PIRPermtNumber)
		throws NoSuchManufacturingPermitException;

	/**
	 * Returns the number of manufacturing permits where PIRPermtNumber = &#63;.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the number of matching manufacturing permits
	 */
	public int countBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber);

	/**
	 * Caches the manufacturing permit in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermit the manufacturing permit
	 */
	public void cacheResult(ManufacturingPermit manufacturingPermit);

	/**
	 * Caches the manufacturing permits in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermits the manufacturing permits
	 */
	public void cacheResult(
		java.util.List<ManufacturingPermit> manufacturingPermits);

	/**
	 * Creates a new manufacturing permit with the primary key. Does not add the manufacturing permit to the database.
	 *
	 * @param manufacturingPermitId the primary key for the new manufacturing permit
	 * @return the new manufacturing permit
	 */
	public ManufacturingPermit create(long manufacturingPermitId);

	/**
	 * Removes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	public ManufacturingPermit remove(long manufacturingPermitId)
		throws NoSuchManufacturingPermitException;

	public ManufacturingPermit updateImpl(
		ManufacturingPermit manufacturingPermit);

	/**
	 * Returns the manufacturing permit with the primary key or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	public ManufacturingPermit findByPrimaryKey(long manufacturingPermitId)
		throws NoSuchManufacturingPermitException;

	/**
	 * Returns the manufacturing permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit, or <code>null</code> if a manufacturing permit with the primary key could not be found
	 */
	public ManufacturingPermit fetchByPrimaryKey(long manufacturingPermitId);

	/**
	 * Returns all the manufacturing permits.
	 *
	 * @return the manufacturing permits
	 */
	public java.util.List<ManufacturingPermit> findAll();

	/**
	 * Returns a range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @return the range of manufacturing permits
	 */
	public java.util.List<ManufacturingPermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing permits
	 */
	public java.util.List<ManufacturingPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManufacturingPermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing permits
	 */
	public java.util.List<ManufacturingPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManufacturingPermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manufacturing permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manufacturing permits.
	 *
	 * @return the number of manufacturing permits
	 */
	public int countAll();

}