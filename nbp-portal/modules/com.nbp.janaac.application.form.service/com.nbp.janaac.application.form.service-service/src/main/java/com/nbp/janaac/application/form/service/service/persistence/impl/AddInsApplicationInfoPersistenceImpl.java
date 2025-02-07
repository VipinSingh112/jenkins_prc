/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsApplicationInfoException;
import com.nbp.janaac.application.form.service.model.AddInsApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddInsApplicationInfoTable;
import com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoImpl;
import com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddInsApplicationInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsApplicationInfoUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the add ins application info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddInsApplicationInfoPersistence.class)
public class AddInsApplicationInfoPersistenceImpl
	extends BasePersistenceImpl<AddInsApplicationInfo>
	implements AddInsApplicationInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddInsApplicationInfoUtil</code> to access the add ins application info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddInsApplicationInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of matching add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddInsApplicationInfo> list = null;

		if (useFinderCache) {
			list = (List<AddInsApplicationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddInsApplicationInfo addInsApplicationInfo : list) {
					if (janaacApplicationId !=
							addInsApplicationInfo.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDINSAPPLICATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddInsApplicationInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddInsApplicationInfo>)QueryUtil.list(
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
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	@Override
	public AddInsApplicationInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException {

		AddInsApplicationInfo addInsApplicationInfo =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addInsApplicationInfo != null) {
			return addInsApplicationInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsApplicationInfoException(sb.toString());
	}

	/**
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	@Override
	public AddInsApplicationInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		List<AddInsApplicationInfo> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	@Override
	public AddInsApplicationInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException {

		AddInsApplicationInfo addInsApplicationInfo = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addInsApplicationInfo != null) {
			return addInsApplicationInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsApplicationInfoException(sb.toString());
	}

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	@Override
	public AddInsApplicationInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddInsApplicationInfo> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add ins application infos before and after the current add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsApplicationInfoId the primary key of the current add ins application info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo[] findBygetJanaacById_PrevAndNext(
			long addInsApplicationInfoId, long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException {

		AddInsApplicationInfo addInsApplicationInfo = findByPrimaryKey(
			addInsApplicationInfoId);

		Session session = null;

		try {
			session = openSession();

			AddInsApplicationInfo[] array = new AddInsApplicationInfoImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addInsApplicationInfo, janaacApplicationId,
				orderByComparator, true);

			array[1] = addInsApplicationInfo;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addInsApplicationInfo, janaacApplicationId,
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

	protected AddInsApplicationInfo getBygetJanaacById_PrevAndNext(
		Session session, AddInsApplicationInfo addInsApplicationInfo,
		long janaacApplicationId,
		OrderByComparator<AddInsApplicationInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDINSAPPLICATIONINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddInsApplicationInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addInsApplicationInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddInsApplicationInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add ins application infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddInsApplicationInfo addInsApplicationInfo :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addInsApplicationInfo);
		}
	}

	/**
	 * Returns the number of add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins application infos
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDINSAPPLICATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addInsApplicationInfo.janaacApplicationId = ?";

	public AddInsApplicationInfoPersistenceImpl() {
		setModelClass(AddInsApplicationInfo.class);

		setModelImplClass(AddInsApplicationInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AddInsApplicationInfoTable.INSTANCE);
	}

	/**
	 * Caches the add ins application info in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfo the add ins application info
	 */
	@Override
	public void cacheResult(AddInsApplicationInfo addInsApplicationInfo) {
		entityCache.putResult(
			AddInsApplicationInfoImpl.class,
			addInsApplicationInfo.getPrimaryKey(), addInsApplicationInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add ins application infos in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfos the add ins application infos
	 */
	@Override
	public void cacheResult(
		List<AddInsApplicationInfo> addInsApplicationInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addInsApplicationInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddInsApplicationInfo addInsApplicationInfo :
				addInsApplicationInfos) {

			if (entityCache.getResult(
					AddInsApplicationInfoImpl.class,
					addInsApplicationInfo.getPrimaryKey()) == null) {

				cacheResult(addInsApplicationInfo);
			}
		}
	}

	/**
	 * Clears the cache for all add ins application infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddInsApplicationInfoImpl.class);

		finderCache.clearCache(AddInsApplicationInfoImpl.class);
	}

	/**
	 * Clears the cache for the add ins application info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddInsApplicationInfo addInsApplicationInfo) {
		entityCache.removeResult(
			AddInsApplicationInfoImpl.class, addInsApplicationInfo);
	}

	@Override
	public void clearCache(List<AddInsApplicationInfo> addInsApplicationInfos) {
		for (AddInsApplicationInfo addInsApplicationInfo :
				addInsApplicationInfos) {

			entityCache.removeResult(
				AddInsApplicationInfoImpl.class, addInsApplicationInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddInsApplicationInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddInsApplicationInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add ins application info with the primary key. Does not add the add ins application info to the database.
	 *
	 * @param addInsApplicationInfoId the primary key for the new add ins application info
	 * @return the new add ins application info
	 */
	@Override
	public AddInsApplicationInfo create(long addInsApplicationInfoId) {
		AddInsApplicationInfo addInsApplicationInfo =
			new AddInsApplicationInfoImpl();

		addInsApplicationInfo.setNew(true);
		addInsApplicationInfo.setPrimaryKey(addInsApplicationInfoId);

		addInsApplicationInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addInsApplicationInfo;
	}

	/**
	 * Removes the add ins application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info that was removed
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo remove(long addInsApplicationInfoId)
		throws NoSuchAddInsApplicationInfoException {

		return remove((Serializable)addInsApplicationInfoId);
	}

	/**
	 * Removes the add ins application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add ins application info
	 * @return the add ins application info that was removed
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo remove(Serializable primaryKey)
		throws NoSuchAddInsApplicationInfoException {

		Session session = null;

		try {
			session = openSession();

			AddInsApplicationInfo addInsApplicationInfo =
				(AddInsApplicationInfo)session.get(
					AddInsApplicationInfoImpl.class, primaryKey);

			if (addInsApplicationInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddInsApplicationInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addInsApplicationInfo);
		}
		catch (NoSuchAddInsApplicationInfoException noSuchEntityException) {
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
	protected AddInsApplicationInfo removeImpl(
		AddInsApplicationInfo addInsApplicationInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addInsApplicationInfo)) {
				addInsApplicationInfo = (AddInsApplicationInfo)session.get(
					AddInsApplicationInfoImpl.class,
					addInsApplicationInfo.getPrimaryKeyObj());
			}

			if (addInsApplicationInfo != null) {
				session.delete(addInsApplicationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addInsApplicationInfo != null) {
			clearCache(addInsApplicationInfo);
		}

		return addInsApplicationInfo;
	}

	@Override
	public AddInsApplicationInfo updateImpl(
		AddInsApplicationInfo addInsApplicationInfo) {

		boolean isNew = addInsApplicationInfo.isNew();

		if (!(addInsApplicationInfo instanceof
				AddInsApplicationInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addInsApplicationInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addInsApplicationInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addInsApplicationInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddInsApplicationInfo implementation " +
					addInsApplicationInfo.getClass());
		}

		AddInsApplicationInfoModelImpl addInsApplicationInfoModelImpl =
			(AddInsApplicationInfoModelImpl)addInsApplicationInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addInsApplicationInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				addInsApplicationInfo.setCreateDate(date);
			}
			else {
				addInsApplicationInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addInsApplicationInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addInsApplicationInfo.setModifiedDate(date);
			}
			else {
				addInsApplicationInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addInsApplicationInfo);
			}
			else {
				addInsApplicationInfo = (AddInsApplicationInfo)session.merge(
					addInsApplicationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddInsApplicationInfoImpl.class, addInsApplicationInfoModelImpl,
			false, true);

		if (isNew) {
			addInsApplicationInfo.setNew(false);
		}

		addInsApplicationInfo.resetOriginalValues();

		return addInsApplicationInfo;
	}

	/**
	 * Returns the add ins application info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add ins application info
	 * @return the add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddInsApplicationInfoException {

		AddInsApplicationInfo addInsApplicationInfo = fetchByPrimaryKey(
			primaryKey);

		if (addInsApplicationInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddInsApplicationInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addInsApplicationInfo;
	}

	/**
	 * Returns the add ins application info with the primary key or throws a <code>NoSuchAddInsApplicationInfoException</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo findByPrimaryKey(long addInsApplicationInfoId)
		throws NoSuchAddInsApplicationInfoException {

		return findByPrimaryKey((Serializable)addInsApplicationInfoId);
	}

	/**
	 * Returns the add ins application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info, or <code>null</code> if a add ins application info with the primary key could not be found
	 */
	@Override
	public AddInsApplicationInfo fetchByPrimaryKey(
		long addInsApplicationInfoId) {

		return fetchByPrimaryKey((Serializable)addInsApplicationInfoId);
	}

	/**
	 * Returns all the add ins application infos.
	 *
	 * @return the add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins application infos
	 */
	@Override
	public List<AddInsApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator,
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

		List<AddInsApplicationInfo> list = null;

		if (useFinderCache) {
			list = (List<AddInsApplicationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDINSAPPLICATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDINSAPPLICATIONINFO;

				sql = sql.concat(AddInsApplicationInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddInsApplicationInfo>)QueryUtil.list(
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
	 * Removes all the add ins application infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddInsApplicationInfo addInsApplicationInfo : findAll()) {
			remove(addInsApplicationInfo);
		}
	}

	/**
	 * Returns the number of add ins application infos.
	 *
	 * @return the number of add ins application infos
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
					_SQL_COUNT_ADDINSAPPLICATIONINFO);

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
		return "addInsApplicationInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDINSAPPLICATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddInsApplicationInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add ins application info persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddInsApplicationInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddInsApplicationInfoUtil.setPersistence(null);

		entityCache.removeCache(AddInsApplicationInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDINSAPPLICATIONINFO =
		"SELECT addInsApplicationInfo FROM AddInsApplicationInfo addInsApplicationInfo";

	private static final String _SQL_SELECT_ADDINSAPPLICATIONINFO_WHERE =
		"SELECT addInsApplicationInfo FROM AddInsApplicationInfo addInsApplicationInfo WHERE ";

	private static final String _SQL_COUNT_ADDINSAPPLICATIONINFO =
		"SELECT COUNT(addInsApplicationInfo) FROM AddInsApplicationInfo addInsApplicationInfo";

	private static final String _SQL_COUNT_ADDINSAPPLICATIONINFO_WHERE =
		"SELECT COUNT(addInsApplicationInfo) FROM AddInsApplicationInfo addInsApplicationInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addInsApplicationInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddInsApplicationInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddInsApplicationInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddInsApplicationInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}