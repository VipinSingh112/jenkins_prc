/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchUsedSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.UsedSecurity;
import com.nbp.osi.insolvency.application.form.services.model.UsedSecurityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.UsedSecurityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.UsedSecurityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UsedSecurityUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the used security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UsedSecurityPersistence.class)
public class UsedSecurityPersistenceImpl
	extends BasePersistenceImpl<UsedSecurity>
	implements UsedSecurityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UsedSecurityUtil</code> to access the used security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UsedSecurityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching used securities
	 */
	@Override
	public List<UsedSecurity> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of matching used securities
	 */
	@Override
	public List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching used securities
	 */
	@Override
	public List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UsedSecurity> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching used securities
	 */
	@Override
	public List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UsedSecurity> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<UsedSecurity> list = null;

		if (useFinderCache) {
			list = (List<UsedSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UsedSecurity usedSecurity : list) {
					if (osiInsolvencyId != usedSecurity.getOsiInsolvencyId()) {
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

			sb.append(_SQL_SELECT_USEDSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UsedSecurityModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<UsedSecurity>)QueryUtil.list(
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
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	@Override
	public UsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws NoSuchUsedSecurityException {

		UsedSecurity usedSecurity = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (usedSecurity != null) {
			return usedSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchUsedSecurityException(sb.toString());
	}

	/**
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security, or <code>null</code> if a matching used security could not be found
	 */
	@Override
	public UsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<UsedSecurity> orderByComparator) {

		List<UsedSecurity> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	@Override
	public UsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws NoSuchUsedSecurityException {

		UsedSecurity usedSecurity = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (usedSecurity != null) {
			return usedSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchUsedSecurityException(sb.toString());
	}

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security, or <code>null</code> if a matching used security could not be found
	 */
	@Override
	public UsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<UsedSecurity> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<UsedSecurity> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the used securities before and after the current used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param usedSecurityId the primary key of the current used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity[] findBygetOsiById_PrevAndNext(
			long usedSecurityId, long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws NoSuchUsedSecurityException {

		UsedSecurity usedSecurity = findByPrimaryKey(usedSecurityId);

		Session session = null;

		try {
			session = openSession();

			UsedSecurity[] array = new UsedSecurityImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, usedSecurity, osiInsolvencyId, orderByComparator,
				true);

			array[1] = usedSecurity;

			array[2] = getBygetOsiById_PrevAndNext(
				session, usedSecurity, osiInsolvencyId, orderByComparator,
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

	protected UsedSecurity getBygetOsiById_PrevAndNext(
		Session session, UsedSecurity usedSecurity, long osiInsolvencyId,
		OrderByComparator<UsedSecurity> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USEDSECURITY_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(UsedSecurityModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(usedSecurity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UsedSecurity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (UsedSecurity usedSecurity :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(usedSecurity);
		}
	}

	/**
	 * Returns the number of used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching used securities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USEDSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"usedSecurity.osiInsolvencyId = ?";

	public UsedSecurityPersistenceImpl() {
		setModelClass(UsedSecurity.class);

		setModelImplClass(UsedSecurityImpl.class);
		setModelPKClass(long.class);

		setTable(UsedSecurityTable.INSTANCE);
	}

	/**
	 * Caches the used security in the entity cache if it is enabled.
	 *
	 * @param usedSecurity the used security
	 */
	@Override
	public void cacheResult(UsedSecurity usedSecurity) {
		entityCache.putResult(
			UsedSecurityImpl.class, usedSecurity.getPrimaryKey(), usedSecurity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the used securities in the entity cache if it is enabled.
	 *
	 * @param usedSecurities the used securities
	 */
	@Override
	public void cacheResult(List<UsedSecurity> usedSecurities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (usedSecurities.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (UsedSecurity usedSecurity : usedSecurities) {
			if (entityCache.getResult(
					UsedSecurityImpl.class, usedSecurity.getPrimaryKey()) ==
						null) {

				cacheResult(usedSecurity);
			}
		}
	}

	/**
	 * Clears the cache for all used securities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UsedSecurityImpl.class);

		finderCache.clearCache(UsedSecurityImpl.class);
	}

	/**
	 * Clears the cache for the used security.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UsedSecurity usedSecurity) {
		entityCache.removeResult(UsedSecurityImpl.class, usedSecurity);
	}

	@Override
	public void clearCache(List<UsedSecurity> usedSecurities) {
		for (UsedSecurity usedSecurity : usedSecurities) {
			entityCache.removeResult(UsedSecurityImpl.class, usedSecurity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(UsedSecurityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(UsedSecurityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new used security with the primary key. Does not add the used security to the database.
	 *
	 * @param usedSecurityId the primary key for the new used security
	 * @return the new used security
	 */
	@Override
	public UsedSecurity create(long usedSecurityId) {
		UsedSecurity usedSecurity = new UsedSecurityImpl();

		usedSecurity.setNew(true);
		usedSecurity.setPrimaryKey(usedSecurityId);

		usedSecurity.setCompanyId(CompanyThreadLocal.getCompanyId());

		return usedSecurity;
	}

	/**
	 * Removes the used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security that was removed
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity remove(long usedSecurityId)
		throws NoSuchUsedSecurityException {

		return remove((Serializable)usedSecurityId);
	}

	/**
	 * Removes the used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the used security
	 * @return the used security that was removed
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity remove(Serializable primaryKey)
		throws NoSuchUsedSecurityException {

		Session session = null;

		try {
			session = openSession();

			UsedSecurity usedSecurity = (UsedSecurity)session.get(
				UsedSecurityImpl.class, primaryKey);

			if (usedSecurity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsedSecurityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(usedSecurity);
		}
		catch (NoSuchUsedSecurityException noSuchEntityException) {
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
	protected UsedSecurity removeImpl(UsedSecurity usedSecurity) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(usedSecurity)) {
				usedSecurity = (UsedSecurity)session.get(
					UsedSecurityImpl.class, usedSecurity.getPrimaryKeyObj());
			}

			if (usedSecurity != null) {
				session.delete(usedSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (usedSecurity != null) {
			clearCache(usedSecurity);
		}

		return usedSecurity;
	}

	@Override
	public UsedSecurity updateImpl(UsedSecurity usedSecurity) {
		boolean isNew = usedSecurity.isNew();

		if (!(usedSecurity instanceof UsedSecurityModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(usedSecurity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					usedSecurity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in usedSecurity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UsedSecurity implementation " +
					usedSecurity.getClass());
		}

		UsedSecurityModelImpl usedSecurityModelImpl =
			(UsedSecurityModelImpl)usedSecurity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (usedSecurity.getCreateDate() == null)) {
			if (serviceContext == null) {
				usedSecurity.setCreateDate(date);
			}
			else {
				usedSecurity.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!usedSecurityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				usedSecurity.setModifiedDate(date);
			}
			else {
				usedSecurity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(usedSecurity);
			}
			else {
				usedSecurity = (UsedSecurity)session.merge(usedSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			UsedSecurityImpl.class, usedSecurityModelImpl, false, true);

		if (isNew) {
			usedSecurity.setNew(false);
		}

		usedSecurity.resetOriginalValues();

		return usedSecurity;
	}

	/**
	 * Returns the used security with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the used security
	 * @return the used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsedSecurityException {

		UsedSecurity usedSecurity = fetchByPrimaryKey(primaryKey);

		if (usedSecurity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsedSecurityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return usedSecurity;
	}

	/**
	 * Returns the used security with the primary key or throws a <code>NoSuchUsedSecurityException</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity findByPrimaryKey(long usedSecurityId)
		throws NoSuchUsedSecurityException {

		return findByPrimaryKey((Serializable)usedSecurityId);
	}

	/**
	 * Returns the used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security, or <code>null</code> if a used security with the primary key could not be found
	 */
	@Override
	public UsedSecurity fetchByPrimaryKey(long usedSecurityId) {
		return fetchByPrimaryKey((Serializable)usedSecurityId);
	}

	/**
	 * Returns all the used securities.
	 *
	 * @return the used securities
	 */
	@Override
	public List<UsedSecurity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of used securities
	 */
	@Override
	public List<UsedSecurity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of used securities
	 */
	@Override
	public List<UsedSecurity> findAll(
		int start, int end, OrderByComparator<UsedSecurity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of used securities
	 */
	@Override
	public List<UsedSecurity> findAll(
		int start, int end, OrderByComparator<UsedSecurity> orderByComparator,
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

		List<UsedSecurity> list = null;

		if (useFinderCache) {
			list = (List<UsedSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_USEDSECURITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_USEDSECURITY;

				sql = sql.concat(UsedSecurityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UsedSecurity>)QueryUtil.list(
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
	 * Removes all the used securities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UsedSecurity usedSecurity : findAll()) {
			remove(usedSecurity);
		}
	}

	/**
	 * Returns the number of used securities.
	 *
	 * @return the number of used securities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_USEDSECURITY);

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
		return "usedSecurityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USEDSECURITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UsedSecurityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the used security persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		UsedSecurityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		UsedSecurityUtil.setPersistence(null);

		entityCache.removeCache(UsedSecurityImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_USEDSECURITY =
		"SELECT usedSecurity FROM UsedSecurity usedSecurity";

	private static final String _SQL_SELECT_USEDSECURITY_WHERE =
		"SELECT usedSecurity FROM UsedSecurity usedSecurity WHERE ";

	private static final String _SQL_COUNT_USEDSECURITY =
		"SELECT COUNT(usedSecurity) FROM UsedSecurity usedSecurity";

	private static final String _SQL_COUNT_USEDSECURITY_WHERE =
		"SELECT COUNT(usedSecurity) FROM UsedSecurity usedSecurity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "usedSecurity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UsedSecurity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UsedSecurity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UsedSecurityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}