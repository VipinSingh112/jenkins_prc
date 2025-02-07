/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationInitiateInvestigationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc application initiate investigation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigationUtil
 * @generated
 */
@ProviderType
public interface JadscApplicationInitiateInvestigationPersistence
	extends BasePersistence<JadscApplicationInitiateInvestigation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscApplicationInitiateInvestigationUtil} to access the jadsc application initiate investigation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation findBygetJadsc_II_CI(
			String caseId)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId);

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc application initiate investigation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application initiate investigation that was removed
	 */
	public JadscApplicationInitiateInvestigation removeBygetJadsc_II_CI(
			String caseId)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Returns the number of jadsc application initiate investigations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application initiate investigations
	 */
	public int countBygetJadsc_II_CI(String caseId);

	/**
	 * Returns all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(String outcome);

	/**
	 * Returns a range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of matching jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(String outcome, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(
			String outcome, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationInitiateInvestigation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(
			String outcome, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationInitiateInvestigation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation findBygetJadsc_By_II_First(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationInitiateInvestigation> orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_By_II_First(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationInitiateInvestigation> orderByComparator);

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation findBygetJadsc_By_II_Last(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationInitiateInvestigation> orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_By_II_Last(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationInitiateInvestigation> orderByComparator);

	/**
	 * Returns the jadsc application initiate investigations before and after the current jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliInvestiId the primary key of the current jadsc application initiate investigation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public JadscApplicationInitiateInvestigation[]
			findBygetJadsc_By_II_PrevAndNext(
				long jadscAppliInvestiId, String outcome,
				com.liferay.portal.kernel.util.OrderByComparator
					<JadscApplicationInitiateInvestigation> orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Removes all the jadsc application initiate investigations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public void removeBygetJadsc_By_II(String outcome);

	/**
	 * Returns the number of jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application initiate investigations
	 */
	public int countBygetJadsc_By_II(String outcome);

	/**
	 * Caches the jadsc application initiate investigation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 */
	public void cacheResult(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation);

	/**
	 * Caches the jadsc application initiate investigations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigations the jadsc application initiate investigations
	 */
	public void cacheResult(
		java.util.List<JadscApplicationInitiateInvestigation>
			jadscApplicationInitiateInvestigations);

	/**
	 * Creates a new jadsc application initiate investigation with the primary key. Does not add the jadsc application initiate investigation to the database.
	 *
	 * @param jadscAppliInvestiId the primary key for the new jadsc application initiate investigation
	 * @return the new jadsc application initiate investigation
	 */
	public JadscApplicationInitiateInvestigation create(
		long jadscAppliInvestiId);

	/**
	 * Removes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public JadscApplicationInitiateInvestigation remove(
			long jadscAppliInvestiId)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	public JadscApplicationInitiateInvestigation updateImpl(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation);

	/**
	 * Returns the jadsc application initiate investigation with the primary key or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public JadscApplicationInitiateInvestigation findByPrimaryKey(
			long jadscAppliInvestiId)
		throws NoSuchJadscApplicationInitiateInvestigationException;

	/**
	 * Returns the jadsc application initiate investigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation, or <code>null</code> if a jadsc application initiate investigation with the primary key could not be found
	 */
	public JadscApplicationInitiateInvestigation fetchByPrimaryKey(
		long jadscAppliInvestiId);

	/**
	 * Returns all the jadsc application initiate investigations.
	 *
	 * @return the jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation> findAll();

	/**
	 * Returns a range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationInitiateInvestigation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application initiate investigations
	 */
	public java.util.List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscApplicationInitiateInvestigation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc application initiate investigations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc application initiate investigations.
	 *
	 * @return the number of jadsc application initiate investigations
	 */
	public int countAll();

}