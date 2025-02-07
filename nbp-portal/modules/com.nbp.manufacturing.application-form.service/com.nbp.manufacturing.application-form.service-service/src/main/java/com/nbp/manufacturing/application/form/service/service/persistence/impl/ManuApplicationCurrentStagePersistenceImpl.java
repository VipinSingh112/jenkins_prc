/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuApplicationCurrentStageException;
import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStage;
import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStageTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuApplicationCurrentStagePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuApplicationCurrentStageUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

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
 * The persistence implementation for the manu application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuApplicationCurrentStagePersistence.class)
public class ManuApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<ManuApplicationCurrentStage>
	implements ManuApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuApplicationCurrentStageUtil</code> to access the manu application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			fetchBygetManufactureById(manufacturingApplicationId);

		if (manuApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuApplicationCurrentStageException(sb.toString());
		}

		return manuApplicationCurrentStage;
	}

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ManuApplicationCurrentStage) {
			ManuApplicationCurrentStage manuApplicationCurrentStage =
				(ManuApplicationCurrentStage)result;

			if (manufacturingApplicationId !=
					manuApplicationCurrentStage.
						getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuApplicationCurrentStagePersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuApplicationCurrentStage manuApplicationCurrentStage =
						list.get(0);

					result = manuApplicationCurrentStage;

					cacheResult(manuApplicationCurrentStage);
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
			return (ManuApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the manu application current stage where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu application current stage that was removed
	 */
	@Override
	public ManuApplicationCurrentStage removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			findBygetManufactureById(manufacturingApplicationId);

		return remove(manuApplicationCurrentStage);
	}

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuApplicationCurrentStage.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_CS_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_CS_MAI;
	private FinderPath _finderPathCountBygetMA_CS_MAI;

	/**
	 * Returns all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_CS_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of matching manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_CS_MAI(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return findBygetMA_CS_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_CS_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_CS_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<ManuApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuApplicationCurrentStage manuApplicationCurrentStage :
						list) {

					if (manufacturingApplicationId !=
							manuApplicationCurrentStage.
								getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CS_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage findBygetMA_CS_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			fetchBygetMA_CS_MAI_First(
				manufacturingApplicationId, orderByComparator);

		if (manuApplicationCurrentStage != null) {
			return manuApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage fetchBygetMA_CS_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		List<ManuApplicationCurrentStage> list = findBygetMA_CS_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage findBygetMA_CS_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			fetchBygetMA_CS_MAI_Last(
				manufacturingApplicationId, orderByComparator);

		if (manuApplicationCurrentStage != null) {
			return manuApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	@Override
	public ManuApplicationCurrentStage fetchBygetMA_CS_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		int count = countBygetMA_CS_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuApplicationCurrentStage> list = findBygetMA_CS_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu application current stages before and after the current manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the current manu application current stage
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage[] findBygetMA_CS_MAI_PrevAndNext(
			long manuApplicationCuurentStageId, long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			findByPrimaryKey(manuApplicationCuurentStageId);

		Session session = null;

		try {
			session = openSession();

			ManuApplicationCurrentStage[] array =
				new ManuApplicationCurrentStageImpl[3];

			array[0] = getBygetMA_CS_MAI_PrevAndNext(
				session, manuApplicationCurrentStage,
				manufacturingApplicationId, orderByComparator, true);

			array[1] = manuApplicationCurrentStage;

			array[2] = getBygetMA_CS_MAI_PrevAndNext(
				session, manuApplicationCurrentStage,
				manufacturingApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuApplicationCurrentStage getBygetMA_CS_MAI_PrevAndNext(
		Session session,
		ManuApplicationCurrentStage manuApplicationCurrentStage,
		long manufacturingApplicationId,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_CS_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu application current stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_CS_MAI(long manufacturingApplicationId) {
		for (ManuApplicationCurrentStage manuApplicationCurrentStage :
				findBygetMA_CS_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	@Override
	public int countBygetMA_CS_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_CS_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CS_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMA_CS_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuApplicationCurrentStage.manufacturingApplicationId = ?";

	public ManuApplicationCurrentStagePersistenceImpl() {
		setModelClass(ManuApplicationCurrentStage.class);

		setModelImplClass(ManuApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(ManuApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the manu application current stage in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 */
	@Override
	public void cacheResult(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		entityCache.putResult(
			ManuApplicationCurrentStageImpl.class,
			manuApplicationCurrentStage.getPrimaryKey(),
			manuApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {
				manuApplicationCurrentStage.getManufacturingApplicationId()
			},
			manuApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu application current stages in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStages the manu application current stages
	 */
	@Override
	public void cacheResult(
		List<ManuApplicationCurrentStage> manuApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuApplicationCurrentStage manuApplicationCurrentStage :
				manuApplicationCurrentStages) {

			if (entityCache.getResult(
					ManuApplicationCurrentStageImpl.class,
					manuApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(manuApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all manu application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuApplicationCurrentStageImpl.class);

		finderCache.clearCache(ManuApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the manu application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		entityCache.removeResult(
			ManuApplicationCurrentStageImpl.class, manuApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<ManuApplicationCurrentStage> manuApplicationCurrentStages) {

		for (ManuApplicationCurrentStage manuApplicationCurrentStage :
				manuApplicationCurrentStages) {

			entityCache.removeResult(
				ManuApplicationCurrentStageImpl.class,
				manuApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuApplicationCurrentStageModelImpl
			manuApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			manuApplicationCurrentStageModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new manu application current stage with the primary key. Does not add the manu application current stage to the database.
	 *
	 * @param manuApplicationCuurentStageId the primary key for the new manu application current stage
	 * @return the new manu application current stage
	 */
	@Override
	public ManuApplicationCurrentStage create(
		long manuApplicationCuurentStageId) {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			new ManuApplicationCurrentStageImpl();

		manuApplicationCurrentStage.setNew(true);
		manuApplicationCurrentStage.setPrimaryKey(
			manuApplicationCuurentStageId);

		manuApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manuApplicationCurrentStage;
	}

	/**
	 * Removes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage remove(
			long manuApplicationCuurentStageId)
		throws NoSuchManuApplicationCurrentStageException {

		return remove((Serializable)manuApplicationCuurentStageId);
	}

	/**
	 * Removes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchManuApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			ManuApplicationCurrentStage manuApplicationCurrentStage =
				(ManuApplicationCurrentStage)session.get(
					ManuApplicationCurrentStageImpl.class, primaryKey);

			if (manuApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuApplicationCurrentStage);
		}
		catch (NoSuchManuApplicationCurrentStageException
					noSuchEntityException) {

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
	protected ManuApplicationCurrentStage removeImpl(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuApplicationCurrentStage)) {
				manuApplicationCurrentStage =
					(ManuApplicationCurrentStage)session.get(
						ManuApplicationCurrentStageImpl.class,
						manuApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (manuApplicationCurrentStage != null) {
				session.delete(manuApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuApplicationCurrentStage != null) {
			clearCache(manuApplicationCurrentStage);
		}

		return manuApplicationCurrentStage;
	}

	@Override
	public ManuApplicationCurrentStage updateImpl(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		boolean isNew = manuApplicationCurrentStage.isNew();

		if (!(manuApplicationCurrentStage instanceof
				ManuApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					manuApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					manuApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuApplicationCurrentStage implementation " +
					manuApplicationCurrentStage.getClass());
		}

		ManuApplicationCurrentStageModelImpl
			manuApplicationCurrentStageModelImpl =
				(ManuApplicationCurrentStageModelImpl)
					manuApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuApplicationCurrentStage.setCreateDate(date);
			}
			else {
				manuApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				manuApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuApplicationCurrentStage);
			}
			else {
				manuApplicationCurrentStage =
					(ManuApplicationCurrentStage)session.merge(
						manuApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuApplicationCurrentStageImpl.class,
			manuApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(manuApplicationCurrentStageModelImpl);

		if (isNew) {
			manuApplicationCurrentStage.setNew(false);
		}

		manuApplicationCurrentStage.resetOriginalValues();

		return manuApplicationCurrentStage;
	}

	/**
	 * Returns the manu application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuApplicationCurrentStageException {

		ManuApplicationCurrentStage manuApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (manuApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuApplicationCurrentStage;
	}

	/**
	 * Returns the manu application current stage with the primary key or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage findByPrimaryKey(
			long manuApplicationCuurentStageId)
		throws NoSuchManuApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)manuApplicationCuurentStageId);
	}

	/**
	 * Returns the manu application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage, or <code>null</code> if a manu application current stage with the primary key could not be found
	 */
	@Override
	public ManuApplicationCurrentStage fetchByPrimaryKey(
		long manuApplicationCuurentStageId) {

		return fetchByPrimaryKey((Serializable)manuApplicationCuurentStageId);
	}

	/**
	 * Returns all the manu application current stages.
	 *
	 * @return the manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu application current stages
	 */
	@Override
	public List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator,
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

		List<ManuApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<ManuApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					ManuApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the manu application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuApplicationCurrentStage manuApplicationCurrentStage :
				findAll()) {

			remove(manuApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of manu application current stages.
	 *
	 * @return the number of manu application current stages
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
					_SQL_COUNT_MANUAPPLICATIONCURRENTSTAGE);

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
		return "manuApplicationCuurentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu application current stage persistence.
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

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_CS_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_CS_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_CS_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_CS_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_CS_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_CS_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			ManuApplicationCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE =
		"SELECT manuApplicationCurrentStage FROM ManuApplicationCurrentStage manuApplicationCurrentStage";

	private static final String _SQL_SELECT_MANUAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT manuApplicationCurrentStage FROM ManuApplicationCurrentStage manuApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_MANUAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(manuApplicationCurrentStage) FROM ManuApplicationCurrentStage manuApplicationCurrentStage";

	private static final String _SQL_COUNT_MANUAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(manuApplicationCurrentStage) FROM ManuApplicationCurrentStage manuApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}