/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

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

import com.nbp.ncra.application.form.service.exception.NoSuchNcraCurrentStageException;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;
import com.nbp.ncra.application.form.service.model.NcraCurrentStageTable;
import com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraCurrentStagePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraCurrentStageUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the ncra current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraCurrentStagePersistence.class)
public class NcraCurrentStagePersistenceImpl
	extends BasePersistenceImpl<NcraCurrentStage>
	implements NcraCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraCurrentStageUtil</code> to access the ncra current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraCurrent_By_NCRA_Id;
	private FinderPath _finderPathCountBygetNcraCurrent_By_NCRA_Id;

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage findBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = fetchBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);

		if (ncraCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraCurrentStageException(sb.toString());
		}

		return ncraCurrentStage;
	}

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId) {

		return fetchBygetNcraCurrent_By_NCRA_Id(ncraApplicationId, true);
	}

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraCurrent_By_NCRA_Id, finderArgs, this);
		}

		if (result instanceof NcraCurrentStage) {
			NcraCurrentStage ncraCurrentStage = (NcraCurrentStage)result;

			if (ncraApplicationId != ncraCurrentStage.getNcraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRACURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRACURRENT_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				List<NcraCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraCurrent_By_NCRA_Id,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncraApplicationId};
							}

							_log.warn(
								"NcraCurrentStagePersistenceImpl.fetchBygetNcraCurrent_By_NCRA_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraCurrentStage ncraCurrentStage = list.get(0);

					result = ncraCurrentStage;

					cacheResult(ncraCurrentStage);
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
			return (NcraCurrentStage)result;
		}
	}

	/**
	 * Removes the ncra current stage where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra current stage that was removed
	 */
	@Override
	public NcraCurrentStage removeBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = findBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);

		return remove(ncraCurrentStage);
	}

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	@Override
	public int countBygetNcraCurrent_By_NCRA_Id(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraCurrent_By_NCRA_Id;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRACURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRACURRENT_BY_NCRA_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRACURRENT_BY_NCRA_ID_NCRAAPPLICATIONID_2 =
			"ncraCurrentStage.ncraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCRA_CS_NAI;
	private FinderPath _finderPathWithoutPaginationFindBygetNCRA_CS_NAI;
	private FinderPath _finderPathCountBygetNCRA_CS_NAI;

	/**
	 * Returns all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findBygetNCRA_CS_NAI(long ncraApplicationId) {
		return findBygetNCRA_CS_NAI(
			ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of matching ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end) {

		return findBygetNCRA_CS_NAI(ncraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return findBygetNCRA_CS_NAI(
			ncraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCRA_CS_NAI;
				finderArgs = new Object[] {ncraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCRA_CS_NAI;
			finderArgs = new Object[] {
				ncraApplicationId, start, end, orderByComparator
			};
		}

		List<NcraCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<NcraCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraCurrentStage ncraCurrentStage : list) {
					if (ncraApplicationId !=
							ncraCurrentStage.getNcraApplicationId()) {

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

			sb.append(_SQL_SELECT_NCRACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRA_CS_NAI_NCRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				list = (List<NcraCurrentStage>)QueryUtil.list(
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
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage findBygetNCRA_CS_NAI_First(
			long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = fetchBygetNCRA_CS_NAI_First(
			ncraApplicationId, orderByComparator);

		if (ncraCurrentStage != null) {
			return ncraCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage fetchBygetNCRA_CS_NAI_First(
		long ncraApplicationId,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		List<NcraCurrentStage> list = findBygetNCRA_CS_NAI(
			ncraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage findBygetNCRA_CS_NAI_Last(
			long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = fetchBygetNCRA_CS_NAI_Last(
			ncraApplicationId, orderByComparator);

		if (ncraCurrentStage != null) {
			return ncraCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	@Override
	public NcraCurrentStage fetchBygetNCRA_CS_NAI_Last(
		long ncraApplicationId,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		int count = countBygetNCRA_CS_NAI(ncraApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcraCurrentStage> list = findBygetNCRA_CS_NAI(
			ncraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra current stages before and after the current ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraCurrentStageId the primary key of the current ncra current stage
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage[] findBygetNCRA_CS_NAI_PrevAndNext(
			long ncraCurrentStageId, long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = findByPrimaryKey(
			ncraCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			NcraCurrentStage[] array = new NcraCurrentStageImpl[3];

			array[0] = getBygetNCRA_CS_NAI_PrevAndNext(
				session, ncraCurrentStage, ncraApplicationId, orderByComparator,
				true);

			array[1] = ncraCurrentStage;

			array[2] = getBygetNCRA_CS_NAI_PrevAndNext(
				session, ncraCurrentStage, ncraApplicationId, orderByComparator,
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

	protected NcraCurrentStage getBygetNCRA_CS_NAI_PrevAndNext(
		Session session, NcraCurrentStage ncraCurrentStage,
		long ncraApplicationId,
		OrderByComparator<NcraCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRACURRENTSTAGE_WHERE);

		sb.append(_FINDER_COLUMN_GETNCRA_CS_NAI_NCRAAPPLICATIONID_2);

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
			sb.append(NcraCurrentStageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncraCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra current stages where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	@Override
	public void removeBygetNCRA_CS_NAI(long ncraApplicationId) {
		for (NcraCurrentStage ncraCurrentStage :
				findBygetNCRA_CS_NAI(
					ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraCurrentStage);
		}
	}

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	@Override
	public int countBygetNCRA_CS_NAI(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCRA_CS_NAI;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRA_CS_NAI_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRA_CS_NAI_NCRAAPPLICATIONID_2 =
			"ncraCurrentStage.ncraApplicationId = ?";

	public NcraCurrentStagePersistenceImpl() {
		setModelClass(NcraCurrentStage.class);

		setModelImplClass(NcraCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(NcraCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the ncra current stage in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStage the ncra current stage
	 */
	@Override
	public void cacheResult(NcraCurrentStage ncraCurrentStage) {
		entityCache.putResult(
			NcraCurrentStageImpl.class, ncraCurrentStage.getPrimaryKey(),
			ncraCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetNcraCurrent_By_NCRA_Id,
			new Object[] {ncraCurrentStage.getNcraApplicationId()},
			ncraCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra current stages in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStages the ncra current stages
	 */
	@Override
	public void cacheResult(List<NcraCurrentStage> ncraCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraCurrentStage ncraCurrentStage : ncraCurrentStages) {
			if (entityCache.getResult(
					NcraCurrentStageImpl.class,
					ncraCurrentStage.getPrimaryKey()) == null) {

				cacheResult(ncraCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all ncra current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraCurrentStageImpl.class);

		finderCache.clearCache(NcraCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the ncra current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraCurrentStage ncraCurrentStage) {
		entityCache.removeResult(NcraCurrentStageImpl.class, ncraCurrentStage);
	}

	@Override
	public void clearCache(List<NcraCurrentStage> ncraCurrentStages) {
		for (NcraCurrentStage ncraCurrentStage : ncraCurrentStages) {
			entityCache.removeResult(
				NcraCurrentStageImpl.class, ncraCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcraCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraCurrentStageModelImpl ncraCurrentStageModelImpl) {

		Object[] args = new Object[] {
			ncraCurrentStageModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraCurrent_By_NCRA_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraCurrent_By_NCRA_Id, args,
			ncraCurrentStageModelImpl);
	}

	/**
	 * Creates a new ncra current stage with the primary key. Does not add the ncra current stage to the database.
	 *
	 * @param ncraCurrentStageId the primary key for the new ncra current stage
	 * @return the new ncra current stage
	 */
	@Override
	public NcraCurrentStage create(long ncraCurrentStageId) {
		NcraCurrentStage ncraCurrentStage = new NcraCurrentStageImpl();

		ncraCurrentStage.setNew(true);
		ncraCurrentStage.setPrimaryKey(ncraCurrentStageId);

		ncraCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraCurrentStage;
	}

	/**
	 * Removes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage remove(long ncraCurrentStageId)
		throws NoSuchNcraCurrentStageException {

		return remove((Serializable)ncraCurrentStageId);
	}

	/**
	 * Removes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage remove(Serializable primaryKey)
		throws NoSuchNcraCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			NcraCurrentStage ncraCurrentStage = (NcraCurrentStage)session.get(
				NcraCurrentStageImpl.class, primaryKey);

			if (ncraCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraCurrentStage);
		}
		catch (NoSuchNcraCurrentStageException noSuchEntityException) {
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
	protected NcraCurrentStage removeImpl(NcraCurrentStage ncraCurrentStage) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraCurrentStage)) {
				ncraCurrentStage = (NcraCurrentStage)session.get(
					NcraCurrentStageImpl.class,
					ncraCurrentStage.getPrimaryKeyObj());
			}

			if (ncraCurrentStage != null) {
				session.delete(ncraCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraCurrentStage != null) {
			clearCache(ncraCurrentStage);
		}

		return ncraCurrentStage;
	}

	@Override
	public NcraCurrentStage updateImpl(NcraCurrentStage ncraCurrentStage) {
		boolean isNew = ncraCurrentStage.isNew();

		if (!(ncraCurrentStage instanceof NcraCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraCurrentStage implementation " +
					ncraCurrentStage.getClass());
		}

		NcraCurrentStageModelImpl ncraCurrentStageModelImpl =
			(NcraCurrentStageModelImpl)ncraCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraCurrentStage.setCreateDate(date);
			}
			else {
				ncraCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraCurrentStage.setModifiedDate(date);
			}
			else {
				ncraCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraCurrentStage);
			}
			else {
				ncraCurrentStage = (NcraCurrentStage)session.merge(
					ncraCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraCurrentStageImpl.class, ncraCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(ncraCurrentStageModelImpl);

		if (isNew) {
			ncraCurrentStage.setNew(false);
		}

		ncraCurrentStage.resetOriginalValues();

		return ncraCurrentStage;
	}

	/**
	 * Returns the ncra current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraCurrentStageException {

		NcraCurrentStage ncraCurrentStage = fetchByPrimaryKey(primaryKey);

		if (ncraCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraCurrentStage;
	}

	/**
	 * Returns the ncra current stage with the primary key or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage findByPrimaryKey(long ncraCurrentStageId)
		throws NoSuchNcraCurrentStageException {

		return findByPrimaryKey((Serializable)ncraCurrentStageId);
	}

	/**
	 * Returns the ncra current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage, or <code>null</code> if a ncra current stage with the primary key could not be found
	 */
	@Override
	public NcraCurrentStage fetchByPrimaryKey(long ncraCurrentStageId) {
		return fetchByPrimaryKey((Serializable)ncraCurrentStageId);
	}

	/**
	 * Returns all the ncra current stages.
	 *
	 * @return the ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra current stages
	 */
	@Override
	public List<NcraCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator,
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

		List<NcraCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<NcraCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRACURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRACURRENTSTAGE;

				sql = sql.concat(NcraCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraCurrentStage>)QueryUtil.list(
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
	 * Removes all the ncra current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraCurrentStage ncraCurrentStage : findAll()) {
			remove(ncraCurrentStage);
		}
	}

	/**
	 * Returns the number of ncra current stages.
	 *
	 * @return the number of ncra current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCRACURRENTSTAGE);

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
		return "ncraCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRACURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra current stage persistence.
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

		_finderPathFetchBygetNcraCurrent_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraCurrent_By_NCRA_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraCurrent_By_NCRA_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraCurrent_By_NCRA_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		_finderPathWithPaginationFindBygetNCRA_CS_NAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCRA_CS_NAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNCRA_CS_NAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCRA_CS_NAI",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNCRA_CS_NAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCRA_CS_NAI",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		NcraCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(NcraCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRACURRENTSTAGE =
		"SELECT ncraCurrentStage FROM NcraCurrentStage ncraCurrentStage";

	private static final String _SQL_SELECT_NCRACURRENTSTAGE_WHERE =
		"SELECT ncraCurrentStage FROM NcraCurrentStage ncraCurrentStage WHERE ";

	private static final String _SQL_COUNT_NCRACURRENTSTAGE =
		"SELECT COUNT(ncraCurrentStage) FROM NcraCurrentStage ncraCurrentStage";

	private static final String _SQL_COUNT_NCRACURRENTSTAGE_WHERE =
		"SELECT COUNT(ncraCurrentStage) FROM NcraCurrentStage ncraCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncraCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}