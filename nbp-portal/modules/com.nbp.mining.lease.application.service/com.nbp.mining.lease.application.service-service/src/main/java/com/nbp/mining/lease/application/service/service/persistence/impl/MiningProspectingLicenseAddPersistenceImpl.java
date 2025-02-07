/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence.impl;

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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingLicenseAddException;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAddTable;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicenseAddPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicenseAddUtil;
import com.nbp.mining.lease.application.service.service.persistence.impl.constants.MINING_LEASE_APPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the mining prospecting license add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningProspectingLicenseAddPersistence.class)
public class MiningProspectingLicenseAddPersistenceImpl
	extends BasePersistenceImpl<MiningProspectingLicenseAdd>
	implements MiningProspectingLicenseAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningProspectingLicenseAddUtil</code> to access the mining prospecting license add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningProspectingLicenseAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMiningById;
	private FinderPath _finderPathWithoutPaginationFindBygetMiningById;
	private FinderPath _finderPathCountBygetMiningById;

	/**
	 * Returns all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId) {

		return findBygetMiningById(
			miningLeaseApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of matching mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end) {

		return findBygetMiningById(miningLeaseApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return findBygetMiningById(
			miningLeaseApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMiningById;
				finderArgs = new Object[] {miningLeaseApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiningById;
			finderArgs = new Object[] {
				miningLeaseApplicationId, start, end, orderByComparator
			};
		}

		List<MiningProspectingLicenseAdd> list = null;

		if (useFinderCache) {
			list = (List<MiningProspectingLicenseAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningProspectingLicenseAdd miningProspectingLicenseAdd :
						list) {

					if (miningLeaseApplicationId !=
							miningProspectingLicenseAdd.
								getMiningLeaseApplicationId()) {

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

			sb.append(_SQL_SELECT_MININGPROSPECTINGLICENSEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningProspectingLicenseAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				list = (List<MiningProspectingLicenseAdd>)QueryUtil.list(
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
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd findBygetMiningById_First(
			long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException {

		MiningProspectingLicenseAdd miningProspectingLicenseAdd =
			fetchBygetMiningById_First(
				miningLeaseApplicationId, orderByComparator);

		if (miningProspectingLicenseAdd != null) {
			return miningProspectingLicenseAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);

		sb.append("}");

		throw new NoSuchMiningProspectingLicenseAddException(sb.toString());
	}

	/**
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd fetchBygetMiningById_First(
		long miningLeaseApplicationId,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		List<MiningProspectingLicenseAdd> list = findBygetMiningById(
			miningLeaseApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd findBygetMiningById_Last(
			long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException {

		MiningProspectingLicenseAdd miningProspectingLicenseAdd =
			fetchBygetMiningById_Last(
				miningLeaseApplicationId, orderByComparator);

		if (miningProspectingLicenseAdd != null) {
			return miningProspectingLicenseAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);

		sb.append("}");

		throw new NoSuchMiningProspectingLicenseAddException(sb.toString());
	}

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd fetchBygetMiningById_Last(
		long miningLeaseApplicationId,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		int count = countBygetMiningById(miningLeaseApplicationId);

		if (count == 0) {
			return null;
		}

		List<MiningProspectingLicenseAdd> list = findBygetMiningById(
			miningLeaseApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining prospecting license adds before and after the current mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the current mining prospecting license add
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd[] findBygetMiningById_PrevAndNext(
			long miningProspectingLicenseAddId, long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException {

		MiningProspectingLicenseAdd miningProspectingLicenseAdd =
			findByPrimaryKey(miningProspectingLicenseAddId);

		Session session = null;

		try {
			session = openSession();

			MiningProspectingLicenseAdd[] array =
				new MiningProspectingLicenseAddImpl[3];

			array[0] = getBygetMiningById_PrevAndNext(
				session, miningProspectingLicenseAdd, miningLeaseApplicationId,
				orderByComparator, true);

			array[1] = miningProspectingLicenseAdd;

			array[2] = getBygetMiningById_PrevAndNext(
				session, miningProspectingLicenseAdd, miningLeaseApplicationId,
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

	protected MiningProspectingLicenseAdd getBygetMiningById_PrevAndNext(
		Session session,
		MiningProspectingLicenseAdd miningProspectingLicenseAdd,
		long miningLeaseApplicationId,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGPROSPECTINGLICENSEADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

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
			sb.append(MiningProspectingLicenseAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(miningLeaseApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miningProspectingLicenseAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningProspectingLicenseAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining prospecting license adds where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 */
	@Override
	public void removeBygetMiningById(long miningLeaseApplicationId) {
		for (MiningProspectingLicenseAdd miningProspectingLicenseAdd :
				findBygetMiningById(
					miningLeaseApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(miningProspectingLicenseAdd);
		}
	}

	/**
	 * Returns the number of mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting license adds
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGPROSPECTINGLICENSEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

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
		_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2 =
			"miningProspectingLicenseAdd.miningLeaseApplicationId = ?";

	public MiningProspectingLicenseAddPersistenceImpl() {
		setModelClass(MiningProspectingLicenseAdd.class);

		setModelImplClass(MiningProspectingLicenseAddImpl.class);
		setModelPKClass(long.class);

		setTable(MiningProspectingLicenseAddTable.INSTANCE);
	}

	/**
	 * Caches the mining prospecting license add in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 */
	@Override
	public void cacheResult(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		entityCache.putResult(
			MiningProspectingLicenseAddImpl.class,
			miningProspectingLicenseAdd.getPrimaryKey(),
			miningProspectingLicenseAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining prospecting license adds in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdds the mining prospecting license adds
	 */
	@Override
	public void cacheResult(
		List<MiningProspectingLicenseAdd> miningProspectingLicenseAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningProspectingLicenseAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningProspectingLicenseAdd miningProspectingLicenseAdd :
				miningProspectingLicenseAdds) {

			if (entityCache.getResult(
					MiningProspectingLicenseAddImpl.class,
					miningProspectingLicenseAdd.getPrimaryKey()) == null) {

				cacheResult(miningProspectingLicenseAdd);
			}
		}
	}

	/**
	 * Clears the cache for all mining prospecting license adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningProspectingLicenseAddImpl.class);

		finderCache.clearCache(MiningProspectingLicenseAddImpl.class);
	}

	/**
	 * Clears the cache for the mining prospecting license add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		entityCache.removeResult(
			MiningProspectingLicenseAddImpl.class, miningProspectingLicenseAdd);
	}

	@Override
	public void clearCache(
		List<MiningProspectingLicenseAdd> miningProspectingLicenseAdds) {

		for (MiningProspectingLicenseAdd miningProspectingLicenseAdd :
				miningProspectingLicenseAdds) {

			entityCache.removeResult(
				MiningProspectingLicenseAddImpl.class,
				miningProspectingLicenseAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningProspectingLicenseAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningProspectingLicenseAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new mining prospecting license add with the primary key. Does not add the mining prospecting license add to the database.
	 *
	 * @param miningProspectingLicenseAddId the primary key for the new mining prospecting license add
	 * @return the new mining prospecting license add
	 */
	@Override
	public MiningProspectingLicenseAdd create(
		long miningProspectingLicenseAddId) {

		MiningProspectingLicenseAdd miningProspectingLicenseAdd =
			new MiningProspectingLicenseAddImpl();

		miningProspectingLicenseAdd.setNew(true);
		miningProspectingLicenseAdd.setPrimaryKey(
			miningProspectingLicenseAddId);

		miningProspectingLicenseAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningProspectingLicenseAdd;
	}

	/**
	 * Removes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd remove(
			long miningProspectingLicenseAddId)
		throws NoSuchMiningProspectingLicenseAddException {

		return remove((Serializable)miningProspectingLicenseAddId);
	}

	/**
	 * Removes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd remove(Serializable primaryKey)
		throws NoSuchMiningProspectingLicenseAddException {

		Session session = null;

		try {
			session = openSession();

			MiningProspectingLicenseAdd miningProspectingLicenseAdd =
				(MiningProspectingLicenseAdd)session.get(
					MiningProspectingLicenseAddImpl.class, primaryKey);

			if (miningProspectingLicenseAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningProspectingLicenseAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningProspectingLicenseAdd);
		}
		catch (NoSuchMiningProspectingLicenseAddException
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
	protected MiningProspectingLicenseAdd removeImpl(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningProspectingLicenseAdd)) {
				miningProspectingLicenseAdd =
					(MiningProspectingLicenseAdd)session.get(
						MiningProspectingLicenseAddImpl.class,
						miningProspectingLicenseAdd.getPrimaryKeyObj());
			}

			if (miningProspectingLicenseAdd != null) {
				session.delete(miningProspectingLicenseAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningProspectingLicenseAdd != null) {
			clearCache(miningProspectingLicenseAdd);
		}

		return miningProspectingLicenseAdd;
	}

	@Override
	public MiningProspectingLicenseAdd updateImpl(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		boolean isNew = miningProspectingLicenseAdd.isNew();

		if (!(miningProspectingLicenseAdd instanceof
				MiningProspectingLicenseAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					miningProspectingLicenseAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					miningProspectingLicenseAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningProspectingLicenseAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningProspectingLicenseAdd implementation " +
					miningProspectingLicenseAdd.getClass());
		}

		MiningProspectingLicenseAddModelImpl
			miningProspectingLicenseAddModelImpl =
				(MiningProspectingLicenseAddModelImpl)
					miningProspectingLicenseAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningProspectingLicenseAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningProspectingLicenseAdd.setCreateDate(date);
			}
			else {
				miningProspectingLicenseAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningProspectingLicenseAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningProspectingLicenseAdd.setModifiedDate(date);
			}
			else {
				miningProspectingLicenseAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningProspectingLicenseAdd);
			}
			else {
				miningProspectingLicenseAdd =
					(MiningProspectingLicenseAdd)session.merge(
						miningProspectingLicenseAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningProspectingLicenseAddImpl.class,
			miningProspectingLicenseAddModelImpl, false, true);

		if (isNew) {
			miningProspectingLicenseAdd.setNew(false);
		}

		miningProspectingLicenseAdd.resetOriginalValues();

		return miningProspectingLicenseAdd;
	}

	/**
	 * Returns the mining prospecting license add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningProspectingLicenseAddException {

		MiningProspectingLicenseAdd miningProspectingLicenseAdd =
			fetchByPrimaryKey(primaryKey);

		if (miningProspectingLicenseAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningProspectingLicenseAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningProspectingLicenseAdd;
	}

	/**
	 * Returns the mining prospecting license add with the primary key or throws a <code>NoSuchMiningProspectingLicenseAddException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd findByPrimaryKey(
			long miningProspectingLicenseAddId)
		throws NoSuchMiningProspectingLicenseAddException {

		return findByPrimaryKey((Serializable)miningProspectingLicenseAddId);
	}

	/**
	 * Returns the mining prospecting license add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add, or <code>null</code> if a mining prospecting license add with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicenseAdd fetchByPrimaryKey(
		long miningProspectingLicenseAddId) {

		return fetchByPrimaryKey((Serializable)miningProspectingLicenseAddId);
	}

	/**
	 * Returns all the mining prospecting license adds.
	 *
	 * @return the mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting license adds
	 */
	@Override
	public List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator,
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

		List<MiningProspectingLicenseAdd> list = null;

		if (useFinderCache) {
			list = (List<MiningProspectingLicenseAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGPROSPECTINGLICENSEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGPROSPECTINGLICENSEADD;

				sql = sql.concat(
					MiningProspectingLicenseAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningProspectingLicenseAdd>)QueryUtil.list(
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
	 * Removes all the mining prospecting license adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningProspectingLicenseAdd miningProspectingLicenseAdd :
				findAll()) {

			remove(miningProspectingLicenseAdd);
		}
	}

	/**
	 * Returns the number of mining prospecting license adds.
	 *
	 * @return the number of mining prospecting license adds
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
					_SQL_COUNT_MININGPROSPECTINGLICENSEADD);

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
		return "miningProspectingLicenseAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGPROSPECTINGLICENSEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningProspectingLicenseAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining prospecting license add persistence.
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

		_finderPathWithPaginationFindBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiningById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"miningLeaseApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, true);

		_finderPathCountBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, false);

		MiningProspectingLicenseAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningProspectingLicenseAddUtil.setPersistence(null);

		entityCache.removeCache(
			MiningProspectingLicenseAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGPROSPECTINGLICENSEADD =
		"SELECT miningProspectingLicenseAdd FROM MiningProspectingLicenseAdd miningProspectingLicenseAdd";

	private static final String _SQL_SELECT_MININGPROSPECTINGLICENSEADD_WHERE =
		"SELECT miningProspectingLicenseAdd FROM MiningProspectingLicenseAdd miningProspectingLicenseAdd WHERE ";

	private static final String _SQL_COUNT_MININGPROSPECTINGLICENSEADD =
		"SELECT COUNT(miningProspectingLicenseAdd) FROM MiningProspectingLicenseAdd miningProspectingLicenseAdd";

	private static final String _SQL_COUNT_MININGPROSPECTINGLICENSEADD_WHERE =
		"SELECT COUNT(miningProspectingLicenseAdd) FROM MiningProspectingLicenseAdd miningProspectingLicenseAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningProspectingLicenseAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningProspectingLicenseAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningProspectingLicenseAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningProspectingLicenseAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}