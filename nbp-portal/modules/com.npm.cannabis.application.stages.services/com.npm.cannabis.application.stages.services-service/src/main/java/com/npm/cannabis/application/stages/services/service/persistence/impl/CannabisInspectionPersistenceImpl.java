/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisInspectionException;
import com.npm.cannabis.application.stages.services.model.CannabisInspection;
import com.npm.cannabis.application.stages.services.model.CannabisInspectionTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisInspectionPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisInspectionUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the cannabis inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisInspectionPersistence.class)
public class CannabisInspectionPersistenceImpl
	extends BasePersistenceImpl<CannabisInspection>
	implements CannabisInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisInspectionUtil</code> to access the cannabis inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CAI;
	private FinderPath _finderPathCountBygetCI_CAI;

	/**
	 * Returns all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId) {

		return findBygetCI_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCI_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisInspection cannabisInspection : list) {
					if (cannabisApplicationId !=
							cannabisInspection.getCannabisApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CAI_First(
			cannabisApplicationId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		List<CannabisInspection> list = findBygetCI_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CAI_Last(
			cannabisApplicationId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		int count = countBygetCI_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisInspection> list = findBygetCI_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection[] findBygetCI_CAI_PrevAndNext(
			long cannabisInspectionId, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = findByPrimaryKey(
			cannabisInspectionId);

		Session session = null;

		try {
			session = openSession();

			CannabisInspection[] array = new CannabisInspectionImpl[3];

			array[0] = getBygetCI_CAI_PrevAndNext(
				session, cannabisInspection, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisInspection;

			array[2] = getBygetCI_CAI_PrevAndNext(
				session, cannabisInspection, cannabisApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisInspection getBygetCI_CAI_PrevAndNext(
		Session session, CannabisInspection cannabisInspection,
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis inspections where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CAI(long cannabisApplicationId) {
		for (CannabisInspection cannabisInspection :
				findBygetCI_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetCI_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCI_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisInspection.cannabisApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathCountBygetCI_CaseId;

	/**
	 * Returns all the cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseId(String caseId) {
		return findBygetCI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return findBygetCI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findBygetCI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisInspection cannabisInspection : list) {
					if (!caseId.equals(cannabisInspection.getCaseId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CaseId_First(
			caseId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		List<CannabisInspection> list = findBygetCI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CaseId_Last(
			caseId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		int count = countBygetCI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisInspection> list = findBygetCI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection[] findBygetCI_CaseId_PrevAndNext(
			long cannabisInspectionId, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		caseId = Objects.toString(caseId, "");

		CannabisInspection cannabisInspection = findByPrimaryKey(
			cannabisInspectionId);

		Session session = null;

		try {
			session = openSession();

			CannabisInspection[] array = new CannabisInspectionImpl[3];

			array[0] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisInspection, caseId, orderByComparator, true);

			array[1] = cannabisInspection;

			array[2] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisInspection getBygetCI_CaseId_PrevAndNext(
		Session session, CannabisInspection cannabisInspection, String caseId,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseId(String caseId) {
		for (CannabisInspection cannabisInspection :
				findBygetCI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetCI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_2 =
		"cannabisInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_3 =
		"(cannabisInspection.caseId IS NULL OR cannabisInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_Status;
	private FinderPath _finderPathCountBygetCI_Status;

	/**
	 * Returns all the cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_Status(String status) {
		return findBygetCI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end) {

		return findBygetCI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findBygetCI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisInspection cannabisInspection : list) {
					if (!status.equals(cannabisInspection.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_Status_First(
			String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_Status_First(
			status, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CannabisInspection> orderByComparator) {

		List<CannabisInspection> list = findBygetCI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_Status_Last(
			String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_Status_Last(
			status, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CannabisInspection> orderByComparator) {

		int count = countBygetCI_Status(status);

		if (count == 0) {
			return null;
		}

		List<CannabisInspection> list = findBygetCI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection[] findBygetCI_Status_PrevAndNext(
			long cannabisInspectionId, String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		status = Objects.toString(status, "");

		CannabisInspection cannabisInspection = findByPrimaryKey(
			cannabisInspectionId);

		Session session = null;

		try {
			session = openSession();

			CannabisInspection[] array = new CannabisInspectionImpl[3];

			array[0] = getBygetCI_Status_PrevAndNext(
				session, cannabisInspection, status, orderByComparator, true);

			array[1] = cannabisInspection;

			array[2] = getBygetCI_Status_PrevAndNext(
				session, cannabisInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisInspection getBygetCI_Status_PrevAndNext(
		Session session, CannabisInspection cannabisInspection, String status,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCI_Status(String status) {
		for (CannabisInspection cannabisInspection :
				findBygetCI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetCI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_2 =
		"cannabisInspection.status = ?";

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_3 =
		"(cannabisInspection.status IS NULL OR cannabisInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathCountBygetCI_CaseIdStatus;

	/**
	 * Returns all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId) {

		return findBygetCI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetCI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisInspection cannabisInspection : list) {
					if (!status.equals(cannabisInspection.getStatus()) ||
						!caseId.equals(cannabisInspection.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		List<CannabisInspection> list = findBygetCI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		int count = countBygetCI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisInspection> list = findBygetCI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long cannabisInspectionId, String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		CannabisInspection cannabisInspection = findByPrimaryKey(
			cannabisInspectionId);

		Session session = null;

		try {
			session = openSession();

			CannabisInspection[] array = new CannabisInspectionImpl[3];

			array[0] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisInspection, status, caseId, orderByComparator,
				true);

			array[1] = cannabisInspection;

			array[2] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisInspection, status, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisInspection getBygetCI_CaseIdStatus_PrevAndNext(
		Session session, CannabisInspection cannabisInspection, String status,
		String caseId, OrderByComparator<CannabisInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseIdStatus(String status, String caseId) {
		for (CannabisInspection cannabisInspection :
				findBygetCI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetCI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2 =
		"cannabisInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3 =
		"(cannabisInspection.status IS NULL OR cannabisInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2 =
		"cannabisInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3 =
		"(cannabisInspection.caseId IS NULL OR cannabisInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetCI_CaseIdApplicationId;

	/**
	 * Returns all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
				finderArgs = new Object[] {status, cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisInspection cannabisInspection : list) {
					if (!status.equals(cannabisInspection.getStatus()) ||
						(cannabisApplicationId !=
							cannabisInspection.getCannabisApplicationId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection =
			fetchBygetCI_CaseIdApplicationId_First(
				status, cannabisApplicationId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		List<CannabisInspection> list = findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection =
			fetchBygetCI_CaseIdApplicationId_Last(
				status, cannabisApplicationId, orderByComparator);

		if (cannabisInspection != null) {
			return cannabisInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisInspectionException(sb.toString());
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		int count = countBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisInspection> list = findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection[] findBygetCI_CaseIdApplicationId_PrevAndNext(
			long cannabisInspectionId, String status,
			long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws NoSuchCannabisInspectionException {

		status = Objects.toString(status, "");

		CannabisInspection cannabisInspection = findByPrimaryKey(
			cannabisInspectionId);

		Session session = null;

		try {
			session = openSession();

			CannabisInspection[] array = new CannabisInspectionImpl[3];

			array[0] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisInspection, status, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisInspection;

			array[2] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisInspection, status, cannabisApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisInspection getBygetCI_CaseIdApplicationId_PrevAndNext(
		Session session, CannabisInspection cannabisInspection, String status,
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		for (CannabisInspection cannabisInspection :
				findBygetCI_CaseIdApplicationId(
					status, cannabisApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2 =
			"cannabisInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3 =
			"(cannabisInspection.status IS NULL OR cannabisInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2 =
			"cannabisInspection.cannabisApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);

		if (cannabisInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisInspectionException(sb.toString());
		}

		return cannabisInspection;
	}

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	@Override
	public CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, cannabisApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof CannabisInspection) {
			CannabisInspection cannabisInspection = (CannabisInspection)result;

			if (!Objects.equals(status, cannabisInspection.getStatus()) ||
				(slotBookedByUser !=
					cannabisInspection.getSlotBookedByUser()) ||
				(cannabisApplicationId !=
					cannabisInspection.getCannabisApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(cannabisApplicationId);

				List<CannabisInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser,
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisInspection cannabisInspection = list.get(0);

					result = cannabisInspection;

					cacheResult(cannabisInspection);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CannabisInspection)result;
		}
	}

	/**
	 * Removes the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis inspection that was removed
	 */
	@Override
	public CannabisInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);

		return remove(cannabisInspection);
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long cannabisApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, cannabisApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CANNABISINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"cannabisInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(cannabisInspection.status IS NULL OR cannabisInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"cannabisInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CANNABISAPPLICATIONID_2 =
			"cannabisInspection.cannabisApplicationId = ?";

	public CannabisInspectionPersistenceImpl() {
		setModelClass(CannabisInspection.class);

		setModelImplClass(CannabisInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisInspectionTable.INSTANCE);
	}

	/**
	 * Caches the cannabis inspection in the entity cache if it is enabled.
	 *
	 * @param cannabisInspection the cannabis inspection
	 */
	@Override
	public void cacheResult(CannabisInspection cannabisInspection) {
		entityCache.putResult(
			CannabisInspectionImpl.class, cannabisInspection.getPrimaryKey(),
			cannabisInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				cannabisInspection.getStatus(),
				cannabisInspection.getSlotBookedByUser(),
				cannabisInspection.getCannabisApplicationId()
			},
			cannabisInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis inspections in the entity cache if it is enabled.
	 *
	 * @param cannabisInspections the cannabis inspections
	 */
	@Override
	public void cacheResult(List<CannabisInspection> cannabisInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisInspection cannabisInspection : cannabisInspections) {
			if (entityCache.getResult(
					CannabisInspectionImpl.class,
					cannabisInspection.getPrimaryKey()) == null) {

				cacheResult(cannabisInspection);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisInspectionImpl.class);

		finderCache.clearCache(CannabisInspectionImpl.class);
	}

	/**
	 * Clears the cache for the cannabis inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisInspection cannabisInspection) {
		entityCache.removeResult(
			CannabisInspectionImpl.class, cannabisInspection);
	}

	@Override
	public void clearCache(List<CannabisInspection> cannabisInspections) {
		for (CannabisInspection cannabisInspection : cannabisInspections) {
			entityCache.removeResult(
				CannabisInspectionImpl.class, cannabisInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CannabisInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisInspectionModelImpl cannabisInspectionModelImpl) {

		Object[] args = new Object[] {
			cannabisInspectionModelImpl.getStatus(),
			cannabisInspectionModelImpl.getSlotBookedByUser(),
			cannabisInspectionModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, cannabisInspectionModelImpl);
	}

	/**
	 * Creates a new cannabis inspection with the primary key. Does not add the cannabis inspection to the database.
	 *
	 * @param cannabisInspectionId the primary key for the new cannabis inspection
	 * @return the new cannabis inspection
	 */
	@Override
	public CannabisInspection create(long cannabisInspectionId) {
		CannabisInspection cannabisInspection = new CannabisInspectionImpl();

		cannabisInspection.setNew(true);
		cannabisInspection.setPrimaryKey(cannabisInspectionId);

		cannabisInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cannabisInspection;
	}

	/**
	 * Removes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection remove(long cannabisInspectionId)
		throws NoSuchCannabisInspectionException {

		return remove((Serializable)cannabisInspectionId);
	}

	/**
	 * Removes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection remove(Serializable primaryKey)
		throws NoSuchCannabisInspectionException {

		Session session = null;

		try {
			session = openSession();

			CannabisInspection cannabisInspection =
				(CannabisInspection)session.get(
					CannabisInspectionImpl.class, primaryKey);

			if (cannabisInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisInspection);
		}
		catch (NoSuchCannabisInspectionException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CannabisInspection removeImpl(
		CannabisInspection cannabisInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisInspection)) {
				cannabisInspection = (CannabisInspection)session.get(
					CannabisInspectionImpl.class,
					cannabisInspection.getPrimaryKeyObj());
			}

			if (cannabisInspection != null) {
				session.delete(cannabisInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisInspection != null) {
			clearCache(cannabisInspection);
		}

		return cannabisInspection;
	}

	@Override
	public CannabisInspection updateImpl(
		CannabisInspection cannabisInspection) {

		boolean isNew = cannabisInspection.isNew();

		if (!(cannabisInspection instanceof CannabisInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisInspection implementation " +
					cannabisInspection.getClass());
		}

		CannabisInspectionModelImpl cannabisInspectionModelImpl =
			(CannabisInspectionModelImpl)cannabisInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisInspection.setCreateDate(date);
			}
			else {
				cannabisInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisInspection.setModifiedDate(date);
			}
			else {
				cannabisInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisInspection);
			}
			else {
				cannabisInspection = (CannabisInspection)session.merge(
					cannabisInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisInspectionImpl.class, cannabisInspectionModelImpl, false,
			true);

		cacheUniqueFindersCache(cannabisInspectionModelImpl);

		if (isNew) {
			cannabisInspection.setNew(false);
		}

		cannabisInspection.resetOriginalValues();

		return cannabisInspection;
	}

	/**
	 * Returns the cannabis inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisInspectionException {

		CannabisInspection cannabisInspection = fetchByPrimaryKey(primaryKey);

		if (cannabisInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisInspection;
	}

	/**
	 * Returns the cannabis inspection with the primary key or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection findByPrimaryKey(long cannabisInspectionId)
		throws NoSuchCannabisInspectionException {

		return findByPrimaryKey((Serializable)cannabisInspectionId);
	}

	/**
	 * Returns the cannabis inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection, or <code>null</code> if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public CannabisInspection fetchByPrimaryKey(long cannabisInspectionId) {
		return fetchByPrimaryKey((Serializable)cannabisInspectionId);
	}

	/**
	 * Returns all the cannabis inspections.
	 *
	 * @return the cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findAll(
		int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis inspections
	 */
	@Override
	public List<CannabisInspection> findAll(
		int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CannabisInspection> list = null;

		if (useFinderCache) {
			list = (List<CannabisInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISINSPECTION;

				sql = sql.concat(CannabisInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cannabis inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisInspection cannabisInspection : findAll()) {
			remove(cannabisInspection);
		}
	}

	/**
	 * Returns the number of cannabis inspections.
	 *
	 * @return the number of cannabis inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_CANNABISINSPECTION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "cannabisInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis inspection persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "cannabisApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "cannabisApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "cannabisApplicationId"
				},
				false);

		CannabisInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisInspectionUtil.setPersistence(null);

		entityCache.removeCache(CannabisInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISINSPECTION =
		"SELECT cannabisInspection FROM CannabisInspection cannabisInspection";

	private static final String _SQL_SELECT_CANNABISINSPECTION_WHERE =
		"SELECT cannabisInspection FROM CannabisInspection cannabisInspection WHERE ";

	private static final String _SQL_COUNT_CANNABISINSPECTION =
		"SELECT COUNT(cannabisInspection) FROM CannabisInspection cannabisInspection";

	private static final String _SQL_COUNT_CANNABISINSPECTION_WHERE =
		"SELECT COUNT(cannabisInspection) FROM CannabisInspection cannabisInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cannabisInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}