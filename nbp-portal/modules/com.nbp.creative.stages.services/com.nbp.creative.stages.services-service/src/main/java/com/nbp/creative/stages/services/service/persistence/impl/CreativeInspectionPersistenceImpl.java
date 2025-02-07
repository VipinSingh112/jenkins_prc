/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence.impl;

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

import com.nbp.creative.stages.services.exception.NoSuchCreativeInspectionException;
import com.nbp.creative.stages.services.model.CreativeInspection;
import com.nbp.creative.stages.services.model.CreativeInspectionTable;
import com.nbp.creative.stages.services.model.impl.CreativeInspectionImpl;
import com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl;
import com.nbp.creative.stages.services.service.persistence.CreativeInspectionPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeInspectionUtil;
import com.nbp.creative.stages.services.service.persistence.impl.constants.CREATIVE_STAGESPersistenceConstants;

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
 * The persistence implementation for the creative inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeInspectionPersistence.class)
public class CreativeInspectionPersistenceImpl
	extends BasePersistenceImpl<CreativeInspection>
	implements CreativeInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeInspectionUtil</code> to access the creative inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreativeInspectionBy_CI;
	private FinderPath _finderPathCountBygetCreativeInspectionBy_CI;

	/**
	 * Returns the creative inspection where caseId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCreativeInspectionBy_CI(String caseId)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			fetchBygetCreativeInspectionBy_CI(caseId);

		if (creativeInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeInspectionException(sb.toString());
		}

		return creativeInspection;
	}

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCreativeInspectionBy_CI(String caseId) {
		return fetchBygetCreativeInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCreativeInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof CreativeInspection) {
			CreativeInspection creativeInspection = (CreativeInspection)result;

			if (!Objects.equals(caseId, creativeInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_2);
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

				List<CreativeInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeInspectionBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"CreativeInspectionPersistenceImpl.fetchBygetCreativeInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeInspection creativeInspection = list.get(0);

					result = creativeInspection;

					cacheResult(creativeInspection);
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
			return (CreativeInspection)result;
		}
	}

	/**
	 * Removes the creative inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative inspection that was removed
	 */
	@Override
	public CreativeInspection removeBygetCreativeInspectionBy_CI(String caseId)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			findBygetCreativeInspectionBy_CI(caseId);

		return remove(creativeInspection);
	}

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetCreativeInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCreativeInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_2 =
			"creativeInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETCREATIVEINSPECTIONBY_CI_CASEID_3 =
			"(creativeInspection.caseId IS NULL OR creativeInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CAI;
	private FinderPath _finderPathCountBygetCI_CAI;

	/**
	 * Returns all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId) {

		return findBygetCI_CAI(
			creativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end) {

		return findBygetCI_CAI(creativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findBygetCI_CAI(
			creativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CAI;
				finderArgs = new Object[] {creativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CAI;
			finderArgs = new Object[] {
				creativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeInspection creativeInspection : list) {
					if (creativeApplicationId !=
							creativeInspection.getCreativeApplicationId()) {

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

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CAI_First(
			long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CAI_First(
			creativeApplicationId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CAI_First(
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		List<CreativeInspection> list = findBygetCI_CAI(
			creativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CAI_Last(
			long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CAI_Last(
			creativeApplicationId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CAI_Last(
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		int count = countBygetCI_CAI(creativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeInspection> list = findBygetCI_CAI(
			creativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection[] findBygetCI_CAI_PrevAndNext(
			long creativeInspectionId, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = findByPrimaryKey(
			creativeInspectionId);

		Session session = null;

		try {
			session = openSession();

			CreativeInspection[] array = new CreativeInspectionImpl[3];

			array[0] = getBygetCI_CAI_PrevAndNext(
				session, creativeInspection, creativeApplicationId,
				orderByComparator, true);

			array[1] = creativeInspection;

			array[2] = getBygetCI_CAI_PrevAndNext(
				session, creativeInspection, creativeApplicationId,
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

	protected CreativeInspection getBygetCI_CAI_PrevAndNext(
		Session session, CreativeInspection creativeInspection,
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETCI_CAI_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(creativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative inspections where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetCI_CAI(long creativeApplicationId) {
		for (CreativeInspection creativeInspection :
				findBygetCI_CAI(
					creativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetCI_CAI(long creativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCI_CAI;

		Object[] finderArgs = new Object[] {creativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

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
		_FINDER_COLUMN_GETCI_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeInspection.creativeApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathCountBygetCI_CaseId;

	/**
	 * Returns all the creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseId(String caseId) {
		return findBygetCI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return findBygetCI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findBygetCI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeInspection creativeInspection : list) {
					if (!caseId.equals(creativeInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
				sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CaseId_First(
			caseId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		List<CreativeInspection> list = findBygetCI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CaseId_Last(
			caseId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		int count = countBygetCI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CreativeInspection> list = findBygetCI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection[] findBygetCI_CaseId_PrevAndNext(
			long creativeInspectionId, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		caseId = Objects.toString(caseId, "");

		CreativeInspection creativeInspection = findByPrimaryKey(
			creativeInspectionId);

		Session session = null;

		try {
			session = openSession();

			CreativeInspection[] array = new CreativeInspectionImpl[3];

			array[0] = getBygetCI_CaseId_PrevAndNext(
				session, creativeInspection, caseId, orderByComparator, true);

			array[1] = creativeInspection;

			array[2] = getBygetCI_CaseId_PrevAndNext(
				session, creativeInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CreativeInspection getBygetCI_CaseId_PrevAndNext(
		Session session, CreativeInspection creativeInspection, String caseId,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
			sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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
						creativeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseId(String caseId) {
		for (CreativeInspection creativeInspection :
				findBygetCI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetCI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

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
		"creativeInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_3 =
		"(creativeInspection.caseId IS NULL OR creativeInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_Status;
	private FinderPath _finderPathCountBygetCI_Status;

	/**
	 * Returns all the creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_Status(String status) {
		return findBygetCI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end) {

		return findBygetCI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findBygetCI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeInspection creativeInspection : list) {
					if (!status.equals(creativeInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
				sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_Status_First(
			String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_Status_First(
			status, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CreativeInspection> orderByComparator) {

		List<CreativeInspection> list = findBygetCI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_Status_Last(
			String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_Status_Last(
			status, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CreativeInspection> orderByComparator) {

		int count = countBygetCI_Status(status);

		if (count == 0) {
			return null;
		}

		List<CreativeInspection> list = findBygetCI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection[] findBygetCI_Status_PrevAndNext(
			long creativeInspectionId, String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		status = Objects.toString(status, "");

		CreativeInspection creativeInspection = findByPrimaryKey(
			creativeInspectionId);

		Session session = null;

		try {
			session = openSession();

			CreativeInspection[] array = new CreativeInspectionImpl[3];

			array[0] = getBygetCI_Status_PrevAndNext(
				session, creativeInspection, status, orderByComparator, true);

			array[1] = creativeInspection;

			array[2] = getBygetCI_Status_PrevAndNext(
				session, creativeInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CreativeInspection getBygetCI_Status_PrevAndNext(
		Session session, CreativeInspection creativeInspection, String status,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
			sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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
						creativeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCI_Status(String status) {
		for (CreativeInspection creativeInspection :
				findBygetCI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetCI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

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
		"creativeInspection.status = ?";

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_3 =
		"(creativeInspection.status IS NULL OR creativeInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathCountBygetCI_CaseIdStatus;

	/**
	 * Returns all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId) {

		return findBygetCI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetCI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeInspection creativeInspection : list) {
					if (!status.equals(creativeInspection.getStatus()) ||
						!caseId.equals(creativeInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
				sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		List<CreativeInspection> list = findBygetCI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		int count = countBygetCI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<CreativeInspection> list = findBygetCI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long creativeInspectionId, String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		CreativeInspection creativeInspection = findByPrimaryKey(
			creativeInspectionId);

		Session session = null;

		try {
			session = openSession();

			CreativeInspection[] array = new CreativeInspectionImpl[3];

			array[0] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, creativeInspection, status, caseId, orderByComparator,
				true);

			array[1] = creativeInspection;

			array[2] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, creativeInspection, status, caseId, orderByComparator,
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

	protected CreativeInspection getBygetCI_CaseIdStatus_PrevAndNext(
		Session session, CreativeInspection creativeInspection, String status,
		String caseId, OrderByComparator<CreativeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
			sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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
						creativeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseIdStatus(String status, String caseId) {
		for (CreativeInspection creativeInspection :
				findBygetCI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
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

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

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
		"creativeInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3 =
		"(creativeInspection.status IS NULL OR creativeInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2 =
		"creativeInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3 =
		"(creativeInspection.caseId IS NULL OR creativeInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetCI_CaseIdApplicationId;

	/**
	 * Returns all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		return findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end) {

		return findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	@Override
	public List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
				finderArgs = new Object[] {status, creativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, creativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeInspection creativeInspection : list) {
					if (!status.equals(creativeInspection.getStatus()) ||
						(creativeApplicationId !=
							creativeInspection.getCreativeApplicationId())) {

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

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(creativeApplicationId);

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseIdApplicationId_First(
			String status, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			fetchBygetCI_CaseIdApplicationId_First(
				status, creativeApplicationId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		List<CreativeInspection> list = findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			fetchBygetCI_CaseIdApplicationId_Last(
				status, creativeApplicationId, orderByComparator);

		if (creativeInspection != null) {
			return creativeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", creativeApplicationId=");
		sb.append(creativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeInspectionException(sb.toString());
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		int count = countBygetCI_CaseIdApplicationId(
			status, creativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeInspection> list = findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection[] findBygetCI_CaseIdApplicationId_PrevAndNext(
			long creativeInspectionId, String status,
			long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws NoSuchCreativeInspectionException {

		status = Objects.toString(status, "");

		CreativeInspection creativeInspection = findByPrimaryKey(
			creativeInspectionId);

		Session session = null;

		try {
			session = openSession();

			CreativeInspection[] array = new CreativeInspectionImpl[3];

			array[0] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, creativeInspection, status, creativeApplicationId,
				orderByComparator, true);

			array[1] = creativeInspection;

			array[2] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, creativeInspection, status, creativeApplicationId,
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

	protected CreativeInspection getBygetCI_CaseIdApplicationId_PrevAndNext(
		Session session, CreativeInspection creativeInspection, String status,
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(creativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative inspections where status = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		for (CreativeInspection creativeInspection :
				findBygetCI_CaseIdApplicationId(
					status, creativeApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, creativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(creativeApplicationId);

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
			"creativeInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3 =
			"(creativeInspection.status IS NULL OR creativeInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CREATIVEAPPLICATIONID_2 =
			"creativeInspection.creativeApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);

		if (creativeInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", creativeApplicationId=");
			sb.append(creativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeInspectionException(sb.toString());
		}

		return creativeInspection;
	}

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, creativeApplicationId, true);
	}

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	@Override
	public CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, creativeApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof CreativeInspection) {
			CreativeInspection creativeInspection = (CreativeInspection)result;

			if (!Objects.equals(status, creativeInspection.getStatus()) ||
				(slotBookedByUser !=
					creativeInspection.getSlotBookedByUser()) ||
				(creativeApplicationId !=
					creativeInspection.getCreativeApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_CREATIVEINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CREATIVEAPPLICATIONID_2);

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

				queryPos.add(creativeApplicationId);

				List<CreativeInspection> list = query.list();

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
									creativeApplicationId
								};
							}

							_log.warn(
								"CreativeInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeInspection creativeInspection = list.get(0);

					result = creativeInspection;

					cacheResult(creativeInspection);
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
			return (CreativeInspection)result;
		}
	}

	/**
	 * Removes the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the creative inspection that was removed
	 */
	@Override
	public CreativeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);

		return remove(creativeInspection);
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long creativeApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, creativeApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CREATIVEINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CREATIVEAPPLICATIONID_2);

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

				queryPos.add(creativeApplicationId);

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
			"creativeInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(creativeInspection.status IS NULL OR creativeInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"creativeInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_CREATIVEAPPLICATIONID_2 =
			"creativeInspection.creativeApplicationId = ?";

	public CreativeInspectionPersistenceImpl() {
		setModelClass(CreativeInspection.class);

		setModelImplClass(CreativeInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeInspectionTable.INSTANCE);
	}

	/**
	 * Caches the creative inspection in the entity cache if it is enabled.
	 *
	 * @param creativeInspection the creative inspection
	 */
	@Override
	public void cacheResult(CreativeInspection creativeInspection) {
		entityCache.putResult(
			CreativeInspectionImpl.class, creativeInspection.getPrimaryKey(),
			creativeInspection);

		finderCache.putResult(
			_finderPathFetchBygetCreativeInspectionBy_CI,
			new Object[] {creativeInspection.getCaseId()}, creativeInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				creativeInspection.getStatus(),
				creativeInspection.getSlotBookedByUser(),
				creativeInspection.getCreativeApplicationId()
			},
			creativeInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative inspections in the entity cache if it is enabled.
	 *
	 * @param creativeInspections the creative inspections
	 */
	@Override
	public void cacheResult(List<CreativeInspection> creativeInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeInspection creativeInspection : creativeInspections) {
			if (entityCache.getResult(
					CreativeInspectionImpl.class,
					creativeInspection.getPrimaryKey()) == null) {

				cacheResult(creativeInspection);
			}
		}
	}

	/**
	 * Clears the cache for all creative inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeInspectionImpl.class);

		finderCache.clearCache(CreativeInspectionImpl.class);
	}

	/**
	 * Clears the cache for the creative inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreativeInspection creativeInspection) {
		entityCache.removeResult(
			CreativeInspectionImpl.class, creativeInspection);
	}

	@Override
	public void clearCache(List<CreativeInspection> creativeInspections) {
		for (CreativeInspection creativeInspection : creativeInspections) {
			entityCache.removeResult(
				CreativeInspectionImpl.class, creativeInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CreativeInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeInspectionModelImpl creativeInspectionModelImpl) {

		Object[] args = new Object[] {creativeInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCreativeInspectionBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeInspectionBy_CI, args,
			creativeInspectionModelImpl);

		args = new Object[] {
			creativeInspectionModelImpl.getStatus(),
			creativeInspectionModelImpl.getSlotBookedByUser(),
			creativeInspectionModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, creativeInspectionModelImpl);
	}

	/**
	 * Creates a new creative inspection with the primary key. Does not add the creative inspection to the database.
	 *
	 * @param creativeInspectionId the primary key for the new creative inspection
	 * @return the new creative inspection
	 */
	@Override
	public CreativeInspection create(long creativeInspectionId) {
		CreativeInspection creativeInspection = new CreativeInspectionImpl();

		creativeInspection.setNew(true);
		creativeInspection.setPrimaryKey(creativeInspectionId);

		creativeInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return creativeInspection;
	}

	/**
	 * Removes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection remove(long creativeInspectionId)
		throws NoSuchCreativeInspectionException {

		return remove((Serializable)creativeInspectionId);
	}

	/**
	 * Removes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection remove(Serializable primaryKey)
		throws NoSuchCreativeInspectionException {

		Session session = null;

		try {
			session = openSession();

			CreativeInspection creativeInspection =
				(CreativeInspection)session.get(
					CreativeInspectionImpl.class, primaryKey);

			if (creativeInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeInspection);
		}
		catch (NoSuchCreativeInspectionException noSuchEntityException) {
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
	protected CreativeInspection removeImpl(
		CreativeInspection creativeInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeInspection)) {
				creativeInspection = (CreativeInspection)session.get(
					CreativeInspectionImpl.class,
					creativeInspection.getPrimaryKeyObj());
			}

			if (creativeInspection != null) {
				session.delete(creativeInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeInspection != null) {
			clearCache(creativeInspection);
		}

		return creativeInspection;
	}

	@Override
	public CreativeInspection updateImpl(
		CreativeInspection creativeInspection) {

		boolean isNew = creativeInspection.isNew();

		if (!(creativeInspection instanceof CreativeInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeInspection implementation " +
					creativeInspection.getClass());
		}

		CreativeInspectionModelImpl creativeInspectionModelImpl =
			(CreativeInspectionModelImpl)creativeInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeInspection.setCreateDate(date);
			}
			else {
				creativeInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeInspection.setModifiedDate(date);
			}
			else {
				creativeInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeInspection);
			}
			else {
				creativeInspection = (CreativeInspection)session.merge(
					creativeInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeInspectionImpl.class, creativeInspectionModelImpl, false,
			true);

		cacheUniqueFindersCache(creativeInspectionModelImpl);

		if (isNew) {
			creativeInspection.setNew(false);
		}

		creativeInspection.resetOriginalValues();

		return creativeInspection;
	}

	/**
	 * Returns the creative inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeInspectionException {

		CreativeInspection creativeInspection = fetchByPrimaryKey(primaryKey);

		if (creativeInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeInspection;
	}

	/**
	 * Returns the creative inspection with the primary key or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection findByPrimaryKey(long creativeInspectionId)
		throws NoSuchCreativeInspectionException {

		return findByPrimaryKey((Serializable)creativeInspectionId);
	}

	/**
	 * Returns the creative inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection, or <code>null</code> if a creative inspection with the primary key could not be found
	 */
	@Override
	public CreativeInspection fetchByPrimaryKey(long creativeInspectionId) {
		return fetchByPrimaryKey((Serializable)creativeInspectionId);
	}

	/**
	 * Returns all the creative inspections.
	 *
	 * @return the creative inspections
	 */
	@Override
	public List<CreativeInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of creative inspections
	 */
	@Override
	public List<CreativeInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative inspections
	 */
	@Override
	public List<CreativeInspection> findAll(
		int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative inspections
	 */
	@Override
	public List<CreativeInspection> findAll(
		int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
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

		List<CreativeInspection> list = null;

		if (useFinderCache) {
			list = (List<CreativeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEINSPECTION;

				sql = sql.concat(CreativeInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeInspection>)QueryUtil.list(
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
	 * Removes all the creative inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeInspection creativeInspection : findAll()) {
			remove(creativeInspection);
		}
	}

	/**
	 * Returns the number of creative inspections.
	 *
	 * @return the number of creative inspections
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
					_SQL_COUNT_CREATIVEINSPECTION);

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
		return "creativeInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative inspection persistence.
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

		_finderPathFetchBygetCreativeInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCreativeInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativeInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"creativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"creativeApplicationId"}, true);

		_finderPathCountBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"creativeApplicationId"}, false);

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
				new String[] {"status", "creativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "creativeApplicationId"}, true);

		_finderPathCountBygetCI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "creativeApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "creativeApplicationId"
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
					"status", "slotBookedByUser", "creativeApplicationId"
				},
				false);

		CreativeInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeInspectionUtil.setPersistence(null);

		entityCache.removeCache(CreativeInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEINSPECTION =
		"SELECT creativeInspection FROM CreativeInspection creativeInspection";

	private static final String _SQL_SELECT_CREATIVEINSPECTION_WHERE =
		"SELECT creativeInspection FROM CreativeInspection creativeInspection WHERE ";

	private static final String _SQL_COUNT_CREATIVEINSPECTION =
		"SELECT COUNT(creativeInspection) FROM CreativeInspection creativeInspection";

	private static final String _SQL_COUNT_CREATIVEINSPECTION_WHERE =
		"SELECT COUNT(creativeInspection) FROM CreativeInspection creativeInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "creativeInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}